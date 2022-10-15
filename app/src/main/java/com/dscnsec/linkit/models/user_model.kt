package com.dscnsec.linkit.models

class User {
    var name: String? = null
    var email: String? = null
    var phone: String? = null
    var profileImage: String? = null
    var uid: String? = null
    var totalShared: Int? = null
    var links :List<Links>? = null
    var friends :List<User>? = null

    constructor() {}
    constructor(name: String?, email: String?, phone: String?, profileImage: String?, uid: String?, totalShared: Int?, links: List<Links>?, friends: List<User>?) {
        this.name = name
        this.email = email
        this.phone = phone
        this.profileImage = profileImage
        this.uid = uid
        this.totalShared = totalShared
        this.links = links
        this.friends = friends
    }

    fun toMap(): Map<String, Any?> {
        return mapOf(
            "name" to name,
            "email" to email,
            "phone" to phone,
            "profileImage" to profileImage,
            "uid" to uid,
            "totalShared" to totalShared,
            "links" to links,
            "friends" to friends
        )
    }
}