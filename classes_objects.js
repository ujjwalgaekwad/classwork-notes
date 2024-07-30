// const student = { //**********************************Prototype *********************************** */
//     fullName: " ujjwal singh",
//     marks: 82.2,
//     printMarks: function() {
//         console.log(" marks is =",this.marks);
//     },
// }


// const faculty = {
//     name() {
//         console.log(" first faculty is amri");
//     }
// }

// student.__proto__ = faculty;

// const boys = {
//     rohit: "Rohit",
//     shashi: " Shashi",
//     nitish: " Nitish",
//     piyush: " Piyush",
// }
// const salary = {
//     salary: function () {
//         console.log("aplog toh kamana chahiye");
//     },
// }
// boys.__proto__ = salary;
//*
class student {
    marks() {
        console.log("marks is 82%");
    }
    name() {
        console.log("my name is ujjwal singh gaikwad");
    }
    work() {
        console.log(" Do nothing");
    }
}
class data extends student {
    work() {
        console.log(" sloving problems, and do somethings");
    }
}
let ujjwalObj = new student;


//********************Practice Questions ******************************** */
// class user {
//     name() {
//         console.log("my name is ujjwal");
//     }
//     email() {
//         console.log("ujjwalsinghgaikwad@gmail.com")
//     }
// }
// let ujjuObj = new user;
//*******************************first question *********************** */
class user {    
    constructor(name,email) {
        this.name= name;
        this.email = email;
    }
    viewData() {
        console.log("Data information is not available")
    }
}
let student1 = new user("ujjwal","ujjwalsinghgaekwad@gmail.com");
let student2 = new user("Abhinav","abhinavkr1212@gmail.com");
