package com.dscnsec.linkit.mock

import com.dscnsec.linkit.models.Links
import com.dscnsec.linkit.models.User


var mockLinks : List<Links> = listOf(
    Links(
        link = "https://www.linkedin.com/company/dscnsec/",
        title = "Linkedin",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/LinkedIn_icon_circle.svg/2048px-LinkedIn_icon_circle.svg.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://chat.whatsapp.com/DndqrP1SXVXCV9m3olpoIJ",
        title = "Whatsapp",
        image = "https://cdn2.iconfinder.com/data/icons/social-messaging-ui-color-shapes-2-free/128/social-whatsapp-circle-512.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://instagram.com/dscnsec",
        title = "Instagram",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Instagram-Icon.png/1025px-Instagram-Icon.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.dev.to",
        title = "Dev.to",
        image = "https://friconix.com/png/fi-swluxx-dev-to.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://www.hashnode.com",
        title = "Hashnode",
        image = "https://cdn.hashnode.com/res/hashnode/image/upload/v1611902473383/CDyAuTy75.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://github.com/dscnsec",
        title = "Github",
        image = "https://cdn-icons-png.flaticon.com/512/25/25231.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
    Links(
        link = "https://discord.com/invite/gFQ4VdWg",
        title = "Discord",
        image = "https://cdn.logojoy.com/wp-content/uploads/20210422095037/discord-mascot.png",
        timestamp = "2021-10-10 10:10:10",
        id = "1234567890",
        linkHits = 0
    ),
)


var mockData : User = User(
    name = "GDSC NSEC",
    email = "app@dscnsec.com",
    phone = "1234567890",
    profileImage = "https://dscnsec.com/favicon.png",
    uid = "1234567890",
    totalShared = 0,
    links = mockLinks,
    friends = listOf()
)