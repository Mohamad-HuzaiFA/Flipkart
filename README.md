
# Flipkart App

## Project Overview
This project is a simple Android app that replicates the user interface of Flipkart's login, signup, and home screens for now. These screens are designed to provide an engaging and user-friendly experience, showcasing basic navigation and UI design concepts. The project is built using Android Studio with Kotlin and XML-based layout design.

## Setup Instructions
To set up and run this project locally:

1. **Clone the Repository**:
    git clone https://github.com/Mohamad-HuzaiFA/Flipkart.git
   
2. **Open the Project in Android Studio**:
   - Launch Android Studio and select `Open an existing project`.
   - Navigate to the cloned repository and open the project.

3. **Build the Project**:
   - Ensure that the necessary SDK is installed.
   - Sync the project with Gradle files if prompted.
   - Build the project to ensure all dependencies are resolved.

4. **Run the Project**:
   - Connect an Android device or use an emulator.
   - Click on the `Run` button or use `Shift + F10` to run the app on your device.

## Screens Designed and Their Purpose
### 1. **Login Screen**:
   - Contains fields for user login, including phone number and email.
   - Includes UI elements like Edittext for input fields, buttons for login, and a link to navigate to the signup page.
   - Designed to capture user credentials in a clean and minimal interface.

### 2. **Signup Screen**:
   - Allows new users to create an account by providing necessary details like username, email, and password.
   - Focused on user-friendly input and ensuring a smooth signup experience.

### 3. **Home Screen**:
   - Mimics the initial user interface of Flipkart, including a search bar, toggle options, and an icon grid.
   - Displays a basic bottom navigation bar, with icons representing different sections like Home, Categories, and Account.
   - Serves as the landing page post-login or signup, giving a preview of the app’s interface.

## Technical Challenges Faced
- **Background Design**: Managing gradient backgrounds and ensuring they display correctly on different screen sizes and devices was challenging.
- **Integrating Drawable Icons**: Adding custom icons into the drawable folder and adjusting their scale and tinting required careful attention to details.
- **Managing Layouts**: Positioning elements within the RelativeLayout and integrating other layouts like LinearLayout inside it, especially for toggle switches and grids, required precise alignment to maintain consistency.
- **Navigation Design**: Implementing a user-friendly bottom navigation bar required ensuring that the icons were appropriately scaled and that the background matched the overall theme of the app.

## Future Plans
- **Add Dynamic Functionality**: Incorporate user authentication using Firebase to allow login and signup with real user data.
- **Responsive Design**: Improve responsiveness to ensure the screens adapt seamlessly to various screen sizes and orientations.
- **Enhanced Home Screen**: Add more sections to the home screen, like personalized offers and dynamic product listings.
- **Navigation Implementation**: Implement proper navigation between screens to create a more realistic app flow.
