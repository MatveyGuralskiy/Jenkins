// GROOVY NUMBERS
println("Welcome to simple Groovy script for Jenkins which works with numbers")
for (x in 1..3) {
  println("Number: ${x}")
}

def array = [1,2,3,4]
def array2 = array + [5,6]
def array3 = array - [2,3]

for (a in array) {
  println("First array Numbers: ${a}")
}

println("All results from every array: \n First array: ${array} \n Second array: ${array2} \n Third array: ${array3}")

def factorial(y) {
  if (y == 0) {
  	return 1
  }
  else {
    return factorial(y - 1) * y
  }
}
User_factorial=factorial(5)
print("Your result of choosen number is: ${User_factorial}")
