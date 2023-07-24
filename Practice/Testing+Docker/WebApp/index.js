// import libraries
const express = require("express");
const app = express();

const bodyparser = require("body-parser");
const path = require("path");

const controller = require("./controller/contoller");

// define middleware
app.use(bodyparser.urlencoded({extended:false}));

// configure application
app.set("view", path.join(__dirname, "view"));
app.set("view engine", "ejs");

app.use("/", controller);

// start server
app.listen(3001, function(){
    console.log("server started at port 3001");
})

module.exports = app;