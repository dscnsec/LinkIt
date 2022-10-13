package com.dscnsec.linkit.mock

import com.dscnsec.linkit.models.Links
import com.dscnsec.linkit.models.User


var mockLinks : List<Links> = listOf(
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.google.com",
        title = "Google",
        image = "https://pbs.twimg.com/profile_images/1455185376876826625/s1AjSxph_400x400.jpg",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
)


var mockData : User = User(
    name = "Mr AppDev",
    email = "app@dscnsec.com",
    phone = "1234567890",
    profileImage = "https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg",
    uid = "1234567890",
    totalShared = 0,
    links = mockLinks,
    friends = listOf()
)