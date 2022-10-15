# LinkIT

Sharing your social media handles is just one scan away.

# Figma Design Link

- [Figma](https://www.figma.com/file/a3DgcjBh7wS8K6PvdFWr5V/Design?node-id=0%3A1)

# App Structure

```
📲 Login Screen/
├── 🏠 DashBoard/
│   └── 🔗 Manage Links
├── 📸 QR Code Scanner
└── 👤 Profile/
    ├── 👤 Preview Profile
    └── ➕ Generate QR Code
```

## Getting Started with Coding Journey 🚀

- This project depends heavily on firebase. A few resources to get you started if this is your first Firebase project:

    * [Blog: Firebase for Jetpack Compose](https://firebase.blog/posts/2022/04/building-an-app-android-jetpack-compose-firebase)

- A few resources to get you started if this is your first Compose project:

    * [Write your first Compose app](https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app#6)


&emsp; For help getting started with Compose development, view the
[online documentation](https://developer.android.com/jetpack/compose/documentation), which offers tutorials,
samples, guidance on mobile development, and a full API reference.

- #### Project Setup

    * Jetpack Compose App:
        * [Download Android Studio](https://developer.android.com/studio)
        * Fork and clone this repository.
        * cd into `LinkIt` directory.

    * Firebase:
        * Create a firebase project
        * Add android app with your package name in firebase console.
        * Enable Google Auth from `Authentication` menu in Firebase.
        * Generate `SHA-1 key hash` for your debug keystore from your pc. This needs to be added to `SHA certificate fingerprints` section under your android app in `Firebase project settings`. Without this step **Google login** won't work.
        * Enable ***Cloud Firestore***
            * Recommended rules for Firestore

                ```JS
                  <coming soon>
               ```

            * Recommended Rules for Cloud Storage

                ```JS
                  <coming soon>
                ```

        * Download `google_services.json` from `Console` -> `Project Settings`. File is present in app section. SDK instructions found in the same page
  
        > if you want to work with official firebase console then feel free to contact us.

* #### How to Contribute?

  Check [Contributing.md](https://github.com/dscnsec/LinkIt/blob/main/CONTRIBUTING.md) for guidelines on contributing to this repo.

<p align="right">(<a href="#linkit">back to top</a>)</p>

## Contact Us

&emsp; If you have a question, please feel free to contact us through [email](mailto:app@dscnsec.com).

<br><br><br><br>

<p align="center">
  Made with ❤️ by Developer Studemt Clubs NSEC
  <br><br>
  <a href="https://opensource.org/licenses/MIT"> <img src="https://img.shields.io/badge/License-MIT-yellow.svg?style=plastic" /> </a>
</p>

