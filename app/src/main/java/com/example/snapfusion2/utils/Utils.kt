package com.example.snapfusion2.utils

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID

fun uploadImage(uri: Uri, folderName: String, callback: (String?) -> Unit) {
    FirebaseStorage.getInstance().getReference(folderName)
        .child(UUID.randomUUID().toString())
        .putFile(uri)
        .addOnSuccessListener {
            it.storage.downloadUrl.addOnSuccessListener { downloadUri ->
                callback(downloadUri.toString())
            }
        }
        .addOnFailureListener {
            callback(null)
        }
}
