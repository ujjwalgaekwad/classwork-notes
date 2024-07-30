//let heroes =["ironman","hulk","mahi","virat","rohit"];
// for( let i=0; i<heroes.length; i++) {
//     console.log(heroes[i]);
// }

//for of
// for(let hero of heroes) {
//     console.log(hero);
// }


// let cities =["Ahmedabad","mumbai","patna","sehore","hyderabad","Siliguri"];
// for(let city of cities) {
//     console.log(city.toUpperCase());
// }

// //Question 1
// let marks=[85,97,44,37,76,60];

// let sum = 0;
// for(let i of marks) {
//     sum += i;
// }
// console.log(sum);

// let average = sum / marks.length;
// console.log("Average",average);

//Array method 
let vegetables = ["Pateto","Tameto","Broccoli","Lettuce"];//push() and pop() methods
let Deleteleditems=vegetables.pop();
console.log(Deleteleditems);

let numbers=[34,34,56,7,75,55];// toString method
console.log(numbers);
console.log(numbers.toString());
console.log(numbers);

let chapris=["Elvish"];//Concat method
let educeted=["Dhruve"];
let lafada=chapris.concat(educeted);
console.log("New lafada=",lafada);

let pcItems=["laptop","mouse","keywords","wireless"];//Add to start unshift/shift  method
pcItems.shift("laptop");
console.log(pcItems);

let fullName='ujjwalsingh';
let fName=fullName.slice(2,6);//Not array to string 
console.log(fName);
console.log(fullName);

let heros=["srk","ssr","vickey","Anushka"];//Slice method
heros= heros.slice(0,1);
console.log(heros);

let table=[11,22,33,44,56,64,77,88,99];//Splice method imp
table.splice(4,2,55,66);
console.log(table);

//Practice question
let companies=["Bloomberg","Microsoft","Uber","Google","IBM","Netflix"];

companies.shift();//1 Question
console.log(companies);

companies.splice(1,1,"Ola");//2 Question
console.log(companies);

companies.unshift("Amazon");
console.log(companies)