# Flipkart Clone App  

## Project Overview  
This project is an Android application that replicates Flipkart's primary user interface screens, including Home, Category, Explore, Profile, and Cart. It features a bottom navigation bar for smooth screen transitions, responsive layouts for various device sizes, and now includes user authentication and authorization to enhance functionality. Built using Kotlin and XML-based layouts in Android Studio, this project demonstrates key UI/UX design, navigation, and security concepts.  

---

## Setup Instructions  

### **To set up and run this project locally:**  

1. **Clone the Repository:**  
   ```bash  
   git clone https://github.com/Mohamad-HuzaiFA/Flipkart.git  
   ```  

2. **Open the Project in Android Studio:**  
   - Open Android Studio and select **"Open an existing project."**  
   - Navigate to the cloned repository and open it.  

3. **Build the Project:**  
   - Ensure the required SDKs and dependencies are installed.  
   - Sync the project with Gradle files if prompted.  
   - Build the project to confirm all dependencies are resolved.  

4. **Run the Project:**  
   - Connect a physical Android device or launch an emulator.  
   - Click **"Run"** or press `Shift + F10` to deploy the app to your device.  

---

## Features Implemented  

### **1. Authentication and Authorization**  
- **Login and Signup:**  
  - Users can log in or sign up with their email and password.  
  - Includes form validation for input fields to ensure proper data entry.  
  - Secure password handling using Firebase Authentication.  

- **Authorization:**  
  - Restricts access to certain screens and features until the user is authenticated.  
  - Provides a seamless login experience with persistent sessions.  

### **2. User Interface Enhancements**  
- **Home Screen:**  
  - Improved UI with animations, carousel for featured products, and personalized sections.  
  - Search functionality to filter products dynamically.  

- **Category Screen:**  
  - Displays product categories with better alignment and grid layouts for a clean look.  
  - Fully clickable icons and cards that navigate to detailed product views.  

- **Profile Screen:**  
  - View and update user information such as name, email, and profile picture.  

- **Cart Screen:**  
  - Lists selected items with options to remove or proceed to checkout.  

---

## Screens Implemented and Their Purpose  

1. **Login Screen**  
   - Allows users to log in securely with email and password.  
   - Includes a “Forgot Password” option for account recovery.  

2. **Signup Screen**  
   - New users can create an account by entering username, email, and password.  
   - Provides validation feedback for incorrect or missing data.  

3. **Home Screen**  
   - Displays a search bar, product carousel, featured products, and clickable categories.  

4. **Category Screen**  
   - Lists product categories and dynamically updates based on backend data.  

5. **Profile Screen**  
   - Displays user information with edit functionality for profile updates.  

6. **Cart Screen**  
   - Lists selected products with price details and options to remove or proceed to purchase.  

---

## Functional Features  

- **Authentication:**  
  - User login and signup functionality with secure password handling.  

- **Bottom Navigation Bar:**  
  - Fixed bottom navigation for seamless transitions between screens.  

- **Carousel and Animations:**  
  - Adds dynamic product displays and UI animations for an engaging experience.  

- **Responsive Design:**  
  - Ensures consistent UI across various screen sizes and orientations.  

---

## Technical Challenges Faced  

1. **Integrating Authentication:**  
   - Setting up Firebase Authentication and managing session persistence.  
   - Implementing robust error handling for login/signup failures.  

2. **Enhancing UI Elements:**  
   - Designing animations for a smooth user experience.  
   - Implementing a dynamic product carousel on the home screen.  

3. **Responsive Layouts:**  
   - Ensuring elements remain visually appealing across different screen sizes.  

4. **Navigation Flow:**  
   - Maintaining a consistent and error-free navigation experience across authenticated and non-authenticated states.  

---

## Future Plans  

- **Product Details Page:**  
  Add detailed product pages with descriptions, images, reviews, and purchasing options.  

- **Order History:**  
  Implement a screen to display past orders with details like order status, date, and total amount.  

- **Advanced Search and Filters:**  
  Enable advanced filtering options on the search screen.  

- **Wishlist Feature:**  
  Allow users to save favorite items for later viewing.  

- **Payment Integration:**  
  Incorporate payment gateway integration for seamless transactions.  
