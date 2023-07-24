const mysql = require("mysql");
var mysqlConnection = mysql.createConnection({
    host:"127.0.0.1",
    port:3307,
    user: "root",
    password: "root",
    database : "users_db"
})

mysqlConnection.connect((err)=>{
    if(err){
        console.log("Error occured while connecting to db. Could not connect!");
        console.log(err.message)
    } else {
        console.log("db connection successful");
    }
})

module.exports = mysqlConnection;
    