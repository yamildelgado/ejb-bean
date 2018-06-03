/***************************************************************************** /
 * Calendar Section
 */

// Global variables needed by calendar functions
var vlsDateFormat = "%Y-%m-%d";
var vlsTimeFormat = "12";
var dtSelectedDate = null;
var strShortDate = null;
var strLongDate = null;

/**
   Trigger:    Direct Call (dc)
   Object:     Multiple - Direct call from HTML page
   Objective:  Setup properties for a fixed calendar
   Parameters: Container's ID - where the calendar will be placed
               InitialDate that calendar should show as active date
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function dcSetupFixedCalendar(container,initialDate)
{
   Calendar.setup
   (
      {
         firstDay     : 1,
         flat         : (container == undefined ? null : container),
         flatCallback : ocCalendarHandler,
         weekNumbers  : false,
         date         : initialDate,
         showOthers   : false,
         align        : "bR"
      }
   );
}

/**
   Trigger:    onClick (oc)
   Object:     Multiple - Direct call from HTML page
   Objective:  Setup properties for a fixed calendar
   Parameters: Container's ID - where the calendar will be placed
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function ocCalendarHandler(calendar,date)
{
   // Get date picked in calendar...
   dtSelectedDate = calendar.date;
   // Transform it to plain string
   // Short date
   strDay = (dtSelectedDate.getDate() < 10) ? ("0" + dtSelectedDate.getDate()) : (dtSelectedDate.getDate());
   strMonth = (dtSelectedDate.getMonth() < 10) ? ("/0" + (dtSelectedDate.getMonth() + 1) + "/") : ("/" + (dtSelectedDate.getMonth() + 1) + "/");
   strYear = dtSelectedDate.getFullYear();
   strShortDate = strDay + strMonth + strYear;
   // Full string date
   strLongDate  = Calendar._DN[dtSelectedDate.getDay()] + " ";
   strLongDate += dtSelectedDate.getDate() + " de ";
   strLongDate += Calendar._MN[dtSelectedDate.getMonth()] + " de ";
   strLongDate += dtSelectedDate.getFullYear();
   // If a date was selected
   if (calendar.dateClicked == true)
   {
      // This is for a popup calendar
      if (calendar.sel != null)
      {
         calendar.sel.value = date;
         calendar.callCloseHandler();
      }
   }
}

/**
   Trigger:    onClick (oc)
   Object:     Multiple - Any object that handles onClick events
   Objective:  Pops up a calendar when the object's onClick event is fired
   Parameters: Date Box ID - where the calendar will write the date picked
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function ocShowCalendar(id)
{
   dcShowCalendar(id, vlsDateFormat, vlsTimeFormat, true);
   return (false);
}

/**
   Trigger:    onFocus (of)
   Object:     Textbox in which the calendar is going to write the date picked 
   Objective:  Pops up a calendar when the object's onFocus event is fired
   Parameters: Date Box ID - where the calendar will write the date picked
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function ofShowCalendar(id)
{
   dcShowCalendar(id, vlsDateFormat, vlsTimeFormat, true);
   return (false);
}

/**
   Trigger:    Direct Call (dc)
   Object:     Calendar - Close Handler in calendar object 
   Objective:  Hide/Destroy the calendar
   Parameters: Calendar object
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function dcCloseCalendar(calendar)
{
   calendar.hide();
   calendar.destroy();
   if (calendar.sel != null)
   {
      calendar.sel.focus();
      calendar.sel.blur();

      // Check if there is an ODU (onDateUpdate) handler defined
      oduHandler = calendar.sel.getAttribute("odu");
      if (oduHandler != null)
      {
        eval(oduHandler);
      }
   }
   _dynarch_popupCalendar = null;
}

/**
   Trigger:    Direct Call (dc)
   Object:     Other event handlers (onClick, onFocus) - see previous functions 
   Objective:  Build and display the calendar widget
   Parameters: Date Box ID - where the calendar will write the date picked
               Date format in Calendar object nomenclature
               Time format in Calendar object nomenclature
   Returns:    Nothing
   -----------------------------------------------------------------------------
   Author:     Juan Pablo López
   Date:       October 04, 2007
 */
function dcShowCalendar(id, format, timeFormat)
{
   // Get the element which will receive the date we picked
   var element = document.getElementById(id);
   // If it is not null, we just hide it
   if (_dynarch_popupCalendar != null)
   {
      _dynarch_popupCalendar.hide();
   }
   // If it is null, we build the calendar
   else
   {
      // New object with handlers
      var cal = new Calendar(true, null, ocCalendarHandler, dcCloseCalendar);
      // Set time format
      if (typeof showsTime == "string")
      {
         cal.timeFormat = (timeFormat == "24" ? timeFormat : "12");
      }
      // Asign our instance to global variable
      _dynarch_popupCalendar = cal;
      // Set some other properties
      cal.weekNumbers = false;
      cal.create();
      cal.setFirstDayOfWeek(1); // Must be after cal.create()
   }
   // Set some other properties
   _dynarch_popupCalendar.setDateFormat(format);
   _dynarch_popupCalendar.parseDate(element.value);
   _dynarch_popupCalendar.sel = element;
   _dynarch_popupCalendar.showAtElement(element, "BR");
}
