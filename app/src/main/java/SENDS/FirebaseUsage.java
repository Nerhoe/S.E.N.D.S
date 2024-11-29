package SENDS;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.DocumentReference;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;

import java.util.concurrent.ExecutionException;

public class FirebaseUsage {
    void test() throws ExecutionException, InterruptedException {
        // Initialize Firestore
        Firestore db = FirestoreOptions.getDefaultInstance().getService();

        // Reference to a document in the "users" collection
        DocumentReference docRef = db.collection("users").document("user1");

        // Get the document asynchronously
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();

        // Check if the document exists and print its data
        if (document.exists()) {
            System.out.println("Document data: " + document.getData());
        } else {
            System.out.println("No such document!");
        }
    }
}
