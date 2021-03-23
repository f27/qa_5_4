function getDataFromTable(table, td){
jsonObject = {};
$(table).each(function(i, element) {
    key =  $(element).find(td).first().text();
    value = $(element).find(td).last().text()
    jsonObject[key] = value;
});
return JSON.stringify(jsonObject);
}
var tableArg = arguments[0];
var tdArg = arguments[1];
return getDataFromTable(tableArg, tdArg);