function getDataFromTable(table, td){
jsonObject = {};
Array.from(document.querySelectorAll(table)).forEach(e =>{
        tds =  e.querySelectorAll(td);
        jsonObject[tds[0].innerHTML] = tds[1].innerHTML;
    }
);
return JSON.stringify(jsonObject);
}
var tableArg = arguments[0]; var tdArg = arguments[1];
return getDataFromTable(tableArg, tdArg);