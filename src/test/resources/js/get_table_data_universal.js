function getDataFromTable(tr, td){
jsonObject = {};
Array.from(document.querySelectorAll(tr)).forEach(e =>{
        tds =  e.querySelectorAll(td);
        jsonObject[tds[0].innerHTML] = tds[1].innerHTML;
    }
);
return JSON.stringify(jsonObject);
}
var trArg = arguments[0]; var tdArg = arguments[1];
return getDataFromTable(trArg, tdArg);