package com.example.snapfusion2.utils

import java.net.URI
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID

fun uploadImage(uri: URI, folderName: String) {
    var imageurl: String? = null
    FirebaseStorage.getInstance().getReference(folderName).child(UUID.randomUUID().toString())
        .putFile(uri)
        .addOnSuccessListener {
            it.storage.downloadUrl.addOnSuccessListener {
                imageurl=it.tostring()


            }
        }
    return imageurl


}