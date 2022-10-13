package com.dscnsec.linkit.models

class Links{
    var link: String? = null
    var title: String? = null
    var image: String? = null
    var timestamp: String? = null
    var id: String? = null
    var linkHits : Int? = null

    constructor() {}
    constructor(link: String?, title: String?, image: String?, timestamp: String?, id: String?, linkHits: Int?) {
        this.link = link
        this.title = title
        this.image = image
        this.timestamp = timestamp
        this.id = id
        this.linkHits = linkHits
    }

    fun toMap(): Map<String, Any?> {
        return mapOf(
            "link" to link,
            "title" to title,
            "image" to image,
            "timestamp" to timestamp,
            "id" to id,
            "linkHits" to linkHits
        )
    }

    companion object {
        fun fromMap(map: Map<String, Any?>): Links {
            val linksModel = Links()
            linksModel.link = map["link"] as String?
            linksModel.title = map["title"] as String?
            linksModel.image = map["image"] as String?
            linksModel.timestamp = map["timestamp"] as String?
            linksModel.id = map["id"] as String?
            linksModel.linkHits = map["linkHits"] as Int?
            return linksModel
        }
    }
}