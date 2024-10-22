// forEach( action:(T)->Unit)

class cookies(
    val name: String,
    val price: Double,
    val toppings:Boolean
)

val cookie = listOf(
    cookies(name = "a",price = 12.4,toppings = false),
    cookies(name = "ab",price = 11.4,toppings = false),
    cookies(name = "abc",price = 13.4,toppings = true),
    cookies(name = "abcd",price = 52.4,toppings = false),
    cookies(name = "abcde",price = 32.4,toppings = true)
    
)



fun main() {
    
        println("Then name of the cookies available are : ")
    cookie.forEach{
        println("${it.name}")
    }

}

// map() function 

class cookies(
    val name: String,
    val price: Double,
    val toppings:Boolean
)

val cookie = listOf(
    cookies(name = "a",price = 12.4,toppings = false),
    cookies(name = "ab",price = 11.4,toppings = false),
    cookies(name = "abc",price = 13.4,toppings = true),
    cookies(name = "abcd",price = 52.4,toppings = false),
    cookies(name = "abcde",price = 32.4,toppings = true)
    
)



fun main() {
    
val fullMenue = cookie.map{"${it.name}-$${it.price}"}
fullMenue.forEach{println(it)}

}

// filter() function

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)


fun main() {
    
val fullMenue = cookies.filter{it.softBaked}
fullMenue.forEach{println("${it.name}")}

}


// groupBy()

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    
    // Group the cookies by whether they are soft-baked or not.
    val example = cookies.groupBy { it.softBaked }
    // The `groupBy` function groups the elements of the `cookies` list by a specified key, 
    // in this case `it.softBaked`. It returns a Map where the key is the value of `softBaked` (true/false), 
    // and the value is a list of cookies that match the key.

    val softBakedMenu = example[true] ?: emptyList()
    // Accesses the group of cookies with `softBaked` set to true using the key `true`. 
    // If no such group exists, it provides an empty list as a fallback.

    val hardBakedMenu = example[false] ?: listOf()
    // Accesses the group of cookies with `softBaked` set to false using the key `false`. 
    // If no such group exists, it returns an empty list created with `listOf()`.

    softBakedMenu.forEach { println("${it.name} - $${it.price}") }
    // Loops through each cookie in `softBakedMenu`, and prints its `name` and `price` 
    // in the format "name - $price".

    hardBakedMenu.forEach { println("${it.name} - $${it.price}") }
    // Loops through each cookie in `hardBakedMenu`, and prints its `name` and `price` 
    // in the same format "name - $price".
}


// Using Partition function 

fun main() {
    val (softBakedCookies, hardBakedCookies) = cookies.partition { it.softBaked }
    // `partition` splits the list based on the condition `it.softBaked`.
    // `softBakedCookies` will contain cookies where `softBaked` is true.
    // `hardBakedCookies` will contain cookies where `softBaked` is false.

    println("Soft Baked Cookies:")
    softBakedCookies.forEach { println("${it.name} - $${it.price}") }

    println("\nHard Baked Cookies:")
    hardBakedCookies.forEach { println("${it.name} - $${it.price}") }
}


// fold()

class Cookie(
    val name: String,            // Represents the name of the cookie
    val softBaked: Boolean,      // Indicates if the cookie is soft baked
    val hasFilling: Boolean,     // Indicates if the cookie has filling
    val price: Double            // Represents the price of the cookie
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    // Using fold to calculate the total price of all cookies
    val totalPrice1 = cookies.fold(0.0) { total, cookie -> 
        total + cookie.price     // Summing the price of each cookie
    }

    // Using reduce to calculate the total price of all cookies
    val totalPrice2 = cookies.map { it.price }.reduce { total, price -> 
        total + price            // Adding up the prices of all cookies
    }

    // Using sum to directly sum up the prices from the mapped list
    val totalPrice3 = cookies.map { it.price }.sum()  // Summing prices from a list of doubles

    // Using sumOf to sum the price directly from the objects in the list
    val totalPrice4 = cookies.sumOf { it.price }  // Summing prices using sumOf for better efficiency

    // Printing all calculated total prices
    println("$totalPrice1")   // Output the total price using fold
    println("$totalPrice2")   // Output the total price using reduce
    println("$totalPrice3")   // Output the total price using sum
    println("$totalPrice4")   // Output the total price using sumOf
}

// using sortedBy() function 

    
val sorted = cookies.sortedBy{it.name}
sorted.forEach{println("${it.name}")}
println()
cookies.forEach{println("${it.name}")}
