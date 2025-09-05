package com.example.mealmind.model

import androidx.lifecycle.ViewModel
import com.example.mealmind.R

data class FoodItem(
    val id: Int,
    val image: String? = null,
    val foodName: String? = null,
    val uploadedDate: String? = null
)

val foodItemList = listOf<FoodItem>(
    FoodItem(
        id = 1,
        image = "https://lakegenevacountrymeats.com/wp-content/uploads/Grilling-Chicken-Breast-1.jpg",
        foodName = "Grilled Chicken",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 2,
        image = "https://2.bp.blogspot.com/_FZ_ZvqwjtxE/TLS-dqYtIvI/AAAAAAAAAXI/gaqjSPvQEFo/s1600/Chicken+Tikka+pic.jpg",
        foodName = "Chicken Tikka Masala",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 3,
        image = "https://www.awesomecuisine.com/wp-content/uploads/2014/03/chicken-tikka.jpg",
        foodName = "Chicken Tikka",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id =4,
        image = "https://img.freepik.com/premium-psd/portrait-grilled-chicken-dish_529119-3595.jpg",
        foodName = "Chicken roasted",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 5,
        image = "https://1.bp.blogspot.com/-KzKj1aBe7-k/XeeVsF5b-2I/AAAAAAAAEII/XOksle75D5IKvng5l7OMWaX9K_0hCQX7wCLcBGAsYHQ/s1600/shahi%2Bpaneerr.jpg",
        foodName = "Shahi Paneer",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 6,
        image = "https://tse2.mm.bing.net/th/id/OIP.1U7rm_HfMhxR1cYmY4-uZAHaEK?rs=1&pid=ImgDetMain&o=7&rm=3",
        foodName = "Dal Makhani",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 7,
        image = "https://www.simplyrecipes.com/thmb/bzi7NSlU2ttrmNE7TnIcIiVgKIo=/2000x1333/filters:fill(auto,1)/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2019__01__Butter-Chicken-LEAD-2-6ca76f24bbe74114a09958073cb9c76f.jpg",
        foodName = "Butter Chicken",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 8,
        image = "https://spiceeats.com/wp-content/uploads/2020/07/Chicken-Biryani.jpg",
        foodName = "Chicken Biryani",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 9,
        image = "https://tse3.mm.bing.net/th/id/OIP.yu1c0La2doVvnEAth-9jZQHaEK?rs=1&pid=ImgDetMain&o=7&rm=3",
        foodName = "Mutton Biryani",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 10,
        image = "https://tse1.mm.bing.net/th/id/OIP.hH_CN9ZjLdIfWSI-aWxe1QHaE5?rs=1&pid=ImgDetMain&o=7&rm=3",
        foodName = "Mutton Chap",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 11,
        image = "https://www.indianhealthyrecipes.com/wp-content/uploads/2015/07/chicken-lollipop.jpg",
        foodName = "Chicken Lollipop",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 12,
        image = "https://img.freepik.com/premium-photo/masala-dosa-is-south-indian-meal-served-with-sambhar-coconut-chutney-selective-focus_466689-22958.jpg?w=2000",
        foodName = "Masala Dosa",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 13,
        image = "https://th.bing.com/th/id/OIP.jMRgrW4FazmeGi25YhisAQHaE8?w=224&h=180&c=7&r=0&o=7&dpr=2&pid=1.7&rm=3",
        foodName = "Idly",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 14,
        image = "https://th.bing.com/th/id/R.744c84bea7c61fad933497e23ab2f2da?rik=XUcQvbvPOM7yLQ&riu=http%3a%2f%2fcdn.taste.com.au%2fimages%2frecipes%2fsfi%2f2005%2f07%2f1018.jpg&ehk=45WmqnZucECJnQ4wEgA1lZ43QP1MLSldWj%2fqD%2bs%2fGY0%3d&risl=&pid=ImgRaw&r=0",
        foodName = "Chicken Sandwitch",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 15,
        image = "https://th.bing.com/th/id/OIP.Qb0MPgwUWKJG81_dLdFzUwHaE8?w=199&h=134&c=7&r=0&o=7&dpr=2&pid=1.7&rm=3",
        foodName = "Rasmalai",
        uploadedDate = "18-07-2025"
    ),
    FoodItem(
        id = 16,
        image ="https://images.slurrp.com/prod/articles/1m5e86yy5vl.webp",
        foodName = "Gulab Jamun",
        uploadedDate = "18-07-2025"
    ),

)
