# NIT3213 Final Assignment - Android App

## 📱 Overview
This Android app is built for the NIT3213 unit to demonstrate login authentication, API integration, and clean architecture using MVVM and Hilt.

## 🌐 API Info
- **Base URL**: https://nit3213api.onrender.com/
- **Login Endpoint**: `/sydney/auth`
- **Dashboard Endpoint**: `/dashboard/{keypass}`

## 💡 Features
- Login screen with API authentication
- Dashboard showing entity list (RecyclerView)
- Details screen showing full entity info

## 🛠 Tech Stack
- Kotlin, MVVM, Retrofit, Hilt (DI), LiveData, Navigation
- Unit Testing with JUnit & Mockito


## ▶️ How to Run
1. Clone the repo  
2. Open in Android Studio  
3. Run on emulator or device (API 24+)  

## ✅ Testing
Run tests using:
```bash
./gradlew test

1. Clone the Repository

If your project is hosted on GitHub:

git clone https://github.com/yourusername/nit3213-final-app.git
cd nit3213-final-app


Or, download the ZIP file and extract it.

2. Open Project in Android Studio

Launch Android Studio

Click on "Open"

Navigate to your project folder and select it

Wait for Gradle sync to complete (you’ll see this at the bottom of the screen)

3. Set Up Emulator or Connect Device

To use an emulator:

Go to Tools > Device Manager

Click "Create Device", choose a device and system image (API 24+)

Start the emulator

To use a physical device:

Enable Developer Options and USB Debugging on your phone

Connect via USB and allow permissions

4. Build the App

Android Studio should automatically sync and build the project.

If it doesn’t, you can:

Click Build > Make Project

Or use the Gradle task:

./gradlew assembleDebug

5. Run the App

Click the Run ▶️ button on the top toolbar

Choose your emulator or device

The app will be installed and launched

6. Login to the App

Use the following login credentials format:

Username: Your first name → Jashanpreet

Password: Your student ID without "s" → 4678094

7. Navigate the App

On successful login, you'll be taken to the Dashboard

Tap any item to view more in the Details screen
