function getDataFromTable(tr, td, keyTd = 0, valueTd = 1){
jsonObject = {};
Array.from(document.querySelectorAll(tr)).forEach(e =>{
        tds =  e.querySelectorAll(td);
        if (typeof tds[keyTd] != "undefined") {
            jsonObject[tds[keyTd].innerHTML] = tds[valueTd].innerHTML;
        }
    }
);
return JSON.stringify(jsonObject);
}
var trArg = arguments[0]; var tdArg = arguments[1];
var keyTd = arguments[2]; var valueTd = arguments[3];
return getDataFromTable(trArg, tdArg);