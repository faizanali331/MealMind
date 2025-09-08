# 🍽️ MealMind – Android App

MealMind is a modern **Android application** built using **Kotlin**, **Jetpack Compose**, and **MVVM architecture**.  
It allows users to **search meals**, **view detailed recipes**, **explore ingredients**, and **read cooking instructions** by fetching real-time data from [TheMealDB API](https://www.themealdb.com/).

---

##  Features
-  **Search Meals** — Quickly find your favorite dishes by name.
-  **Meal Details** — View ingredients, categories, area, and cooking instructions.
-  **Image Loading** — Smooth and efficient images using **Coil**.
-  **Bookmark Toggle** — Add/remove meals to favorites easily.
-  **Reactive UI** — Built entirely with **Jetpack Compose** for a clean, modern UI.
-  **API Integration** — Uses [TheMealDB API](https://www.themealdb.com/) for fetching meal data in real-time.

---

## 🏗 Tech Stack

| **Technology**      | **Purpose**                           |
|----------------------|---------------------------------------|
| **Kotlin**          | Primary programming language          |
| **Jetpack Compose** | Declarative UI framework              |
| **MVVM**           | Clean architecture pattern            |
| **Retrofit**       | Networking layer for API integration  |
| **Gson**          | JSON parsing                           |
| **Coroutines**    | Asynchronous programming              |
| **StateFlow**    | Reactive state management             |
| **ViewModel**    | Manages and holds UI-related data      |
| **Coil**        | Efficient image loading                |


---

##  MVVM Architecture Overview

The app follows the **MVVM (Model-View-ViewModel)** architecture:

- **Model** → Represents the data layer, handles API requests using **Retrofit**.
- **View** → Built using **Jetpack Compose**, displays meals and details.
- **ViewModel** → Manages UI state using **StateFlow** and communicates with the repository.

---

##  API Integration

We used the **[TheMealDB API](https://www.themealdb.com/)** to fetch meal data.

**Base URL:** https://www.themealdb.com/api/json/v1/1/?utm_source=chatgpt.com


**Endpoints Used:**
- `search.php?s=<meal>` → Fetch meals by name.
- `lookup.php?i=<id>` → Fetch meal details by ID.

---

## 📦 Dependencies

Add these dependencies to your `app/build.gradle` file:

```gradle
dependencies {
    implementation "androidx.core:core-ktx:1.13.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.8.3"
    implementation "androidx.activity:activity-compose:1.9.0"
    implementation "androidx.compose.ui:ui:1.6.8"
    implementation "androidx.compose.material3:material3:1.2.1"
    implementation "androidx.navigation:navigation-compose:2.7.7"

    // Retrofit & Gson
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"

    // Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3"

    // Coil for image loading
    implementation "io.coil-kt:coil-compose:2.5.0"
}

Clone the Repository
git clone https://github.com/your-username/MealMind.git


Author

Mohd Faizan
Email: faizanali331@gmail.com
GitHub: https://github.com/faizanali331
LinkedIn: https://linkedin.com/in/mfakk





