/*
*Dynamic table add rows with DOM
*
*Date: 14/05/2012
*Author: Luz Elen Peralta Ayala
*Version: 1.0
*/

var logs="";
var consecutiveRow=2;

//EVENT TYPES
var ON_BLUR = "onblur";
var ON_CHANGE = "onchange";
var ON_CLICK = "onclick";
var ON_DBL_CLICK = "ondblclick";	
var ON_FOCUS = "onfocus";
var ON_MOUSE_DOWN = "onmousedown";
var ON_MOUSE_MOVE = "onmousemove";	
var ON_MOUSE_OUT = "onmouseout";
var ON_MOUSE_OVER = "onmouseover";
var ON_MOUSE_UP = "onmouseup";
var ON_KEY_DOWN = "onkeydown";
var ON_KEY_PRESS = "onkeypress";
var ON_KEY_UP= "onkeyup" 
var ON_SELECT= "onselect";

//INPUT TYPES
var TEXT ="text";
var CHECKBOX = "checkbox";
var RADIO = "radio";
var IMG = "img";
var SELECT = "select";
var BUTTON = "button";
var STRING = "string";



/*Add a new row*/

function addDynamicRow(idTable, rowId, newRow, classRow, styleRow, pathImageDelete){
   var table = document.getElementById(idTable);  
   if (table!=null){ //1
      var countRows = getCountRows(idTable);
      var row = table.insertRow(countRows);
      row.id="row"+consecutiveRow;
      row.className = classRow;
      row.style.cssText = styleRow;
      if (row!=null && newRow.length>=2){//2
        for(i=0;i<= newRow.length;i++){//3
          var cell = newRow[i];
          var newCell = row.insertCell(i);
          var elementL;
          if (cell!=null){  
             if (cell[0] == SELECT){
               element = document.createElement(SELECT);
               if (cell.length>=9 && cell[9]!=null){
                 for (k=0;k<cell[9].length;k++){
                     var option = cell[9][k];
                     if (option!=null){
                        var opt = document.createElement("option");
                        opt.value = option[0];
                        opt.innerHTML= option[1];
                        element.appendChild(opt);
                     }
                 }
               }
             }else if (cell[0] == IMG){
		element = document.createElement("img");
                if (cell.length >=10){
	           element.src = cell[10];
                }
             }else if (cell[0] != STRING ){
                element = document.createElement("input");
	        element.type = cell[0];
             }
             
	     element.id = cell[1];
             if (cell.length >=2){
                element.name = cell[2];
             }
             if (cell.length >=3){
                addEvents(element,cell);
             }
             if (cell.length >=4){
                element.className= cell[4];
             }
             if (cell.length >=5 && cell[0] != STRING ){
                element.style.cssText=cell[5];
             }
             if (cell.length >=7){
                newCell.className=cell[7];
             }
             if (cell.length >=8){
                newCell.style.cssText=cell[8];
             }
             if (cell.length >=11){
                element.value=cell[11];
             }
           }else{
             if (pathImageDelete!=null && pathImageDelete!=""){
                newCell.style.cssText="text-align:center";
                var element = document.createElement("img");
	        element.src = pathImageDelete;
                element.onmouseover= function(){ 
                this.style.cursor='pointer';
                };
                element.onclick= new Function("deleteRow('"+rowId+consecutiveRow+"')");
	     }else{
                logs+="\nMethod addDynamicRow: pathImageDelete is empty";
	     }
           }
           if ( cell!=null && cell.length >=6 && cell[6]!=null){
                var text = cell[6].split(",");
	 	
                if (text[1]=="right"){
                   if (cell[0] != STRING ){
	              newCell.appendChild(element);
		   }
		   newCell.appendChild(document.createTextNode(text[0]));
                }else{
                   newCell.appendChild(document.createTextNode(text[0]));  
                   if (cell[0] != STRING ){
                      newCell.appendChild(element);
	           }
                }
           }else{
         	newCell.appendChild(element);
           }
        }//3
     }else{ //2
        logs+="\nMethod addDynamicRow: The type and id of the cell are required";
     }
  }else{ //1
	logs+="\nMethod addDynamicRow: The idTable doesn't exist "+idTable;
  }
  consecutiveRow++;
};



/*Delete a row*/

function deleteRow(idRow){
   var row =  document.getElementById(idRow);
   if (row !=null){
     row.parentNode.removeChild(row);
   }else{
      logs+="\nMethod deleteRow: The idRow doesn't exist "+idRow;
   }
}



/*Get total rows including the header*/

function getCountRows(idTable){
   var table = document.getElementById(idTable);
   var countRows = 0;
   if (table!=null){
       countRows = table.rows.length;
   }else{
       logs+="\nMethod getCountRows: The idTable doesn't exist "+idTable;
   }
   return countRows;
}



/*Add events to the input*/

function addEvents(element, cell){
   var events = cell[3];
   if (events!=null){
      for (j=0 ;j<events.length;j++){
       var event = events[j];
       if (event.length == 2){
         var typeEvent = event[0].toLowerCase();
         var functionEvent = event[1];
         if ( functionEvent == ON_BLUR){
            element.onblur= new Function(functionEvent);

         }else if ( typeEvent == ON_CHANGE  ){
	    element.onchange= new Function(functionEvent);

         }else if ( typeEvent == ON_CLICK ){ 	
            element.onclick= new Function(functionEvent);

         }else if ( typeEvent == ON_DBL_CLICK ){ 	
            element.ondblclick= new Function(functionEvent);

         }else if ( typeEvent == ON_FOCUS ){
            element.onfocus= new Function(functionEvent); 	

         }else if ( typeEvent == ON_MOUSE_DOWN ){
            element.onmousedown= new Function(functionEvent); 	

         }else if ( typeEvent == ON_MOUSE_MOVE ){ 	
            element.onmousemove = new Function(functionEvent);

         }else if ( typeEvent == ON_MOUSE_OUT ){ 
            element.onmouseout = new Function(functionEvent);	

         }else if ( typeEvent == ON_MOUSE_OVER ){ 
            element.onmouseover= new Function(functionEvent);	

         }else if ( typeEvent == ON_MOUSE_UP ){ 
            element.onmouseup = new Function(functionEvent);	

         }else if ( typeEvent == ON_KEY_DOWN ){
            element.onkeydown = new Function(functionEvent); 	

         }else if ( typeEvent == ON_KEY_PRESS ){
              element.onkeypress=functionEvent;

         }else if ( typeEvent == ON_KEY_UP ){
            element.onkeyup = new Function(functionEvent); 	

         }else if ( typeEvent == ON_SELECT ){
            element.onselect = new Function(functionEvent);
         }else{
            logs+="\nMethod addEvents: The event "+typeEvent+" doesn't exist. Please check the right spelling ";
	}
       }
     }
   }
}



/*Show some logs */

function showLogs(){
	alert(logs);
}

/*Set style rows*/

function setStyleRows(evenRowClass, oddRowClass, idTable){
	var table = document.getElementById(idTable);
	if (table!=null){ 
      var countRows = getCountRows(idTable);
      for(p=1; p<countRows;p++){
      var isEven = p%2;
      var element =  table.rows[p];
      if (isEven == 0){
      	element.className = evenRowClass;
      }else{
      	element.className = oddRowClass;
      }
      }
    } 
}
