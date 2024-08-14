let newbtn = document.createElement("button");
newbtn.style.backgroundColor = "blue";
newbtn.style.color = "#fff";
newbtn.innerText ="Click me!";
document.querySelector("body").prepend(newbtn);  // top align

let paragraph = document.createElement("p");
paragraph.innerText ="this is div";
document.querySelector("body").append(paragraph);//bottom align

let headingTag = document.createElement("h1");
headingTag.style.textAlign ="center";
headingTag.style.color = "yellow";
headingTag.style.fontWeight = "800";
headingTag.innerText ="Hello guys!";
document.querySelector("body").after(headingTag);//bottom align
