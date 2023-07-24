// import libraries
const express = require("express");
var controller = express.Router();

const connection = require("../model/dbUtils"); // establish database connection

controller.get("/", (req, resp)=>{
    resp.render("login");
})

controller.post("/login", (req, resp)=>{
    const username= req.body["user-name"];
    const password = req.body["password"];
    const confirmPassword = req.body["confirm-password"];

    if(password !== confirmPassword)
        resp.render("login");
    else{
        connection.query("select user_id from users where user_name = ? and password = ?", [username, password], (err, data, fields)=>{
            if(!err){
                resp.redirect("index");
            } else{
                resp.redirect("login");
            }
        })
    }
})

module.exports = controller;