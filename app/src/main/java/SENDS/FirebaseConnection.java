package SENDS;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.FirebaseApp;


import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConnection {

     static void fbdbInit() throws IOException {
        // Path to the service account key
        String serviceAccountKeyPath = "C:\\Users\\Aaron\\Downloads\\sends-dcede-firebase-adminsdk-szzqj-bc1ce20459.json";
        String fireBaseDataBase = "https://sends-dcede-default-rtdb.asia-southeast1.firebasedatabase.app/" ;
        // Initialize Firebase using the service account key
        FileInputStream serviceAccount = new FileInputStream(serviceAccountKeyPath);

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(com.google.auth.oauth2.GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl(fireBaseDataBase)  // Replace with your database URL
                .build();

        FirebaseApp.initializeApp(options);

        // Firebase is now initialized, you can start using Firebase services
        System.out.println("Firebase initialized successfully");

        // Example: Use Firebase Realtime Database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("messages");

        // Example: Use Firebase Authentication
        FirebaseAuth auth = FirebaseAuth.getInstance();
        // You can now interact with Firebase Authentication
    }
}
