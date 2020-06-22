package com.ggoraa.glados.controller

import com.ggoraa.glados.model.DefaultResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/")
    fun homeResponse(): DefaultResponse {
        return DefaultResponse(
                message = "You are at homepage of GLaDOS updates server. " +
                        "To start using GLaDOS updates server, go to GLaDOS GitHub page and look for Wiki tab. " +
                        "There will be tutorials on how to build queries to this server.",
                link = "https://github.com/GGorAA/GLaDOS"
        )
    }
}