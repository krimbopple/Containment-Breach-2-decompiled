Function loadoptionsini%()
    opt\Field58 = inigetint(optionfile, "Graphics", "Enable Bump Mapping", $01, $01)
    opt\Field16 = inigetint(optionfile, "Graphics", "VSync", $01, $01)
    opt\Field7 = inigetint(optionfile, "Graphics", "Anti-Aliasing", $01, $01)
    opt\Field56 = inigetint(optionfile, "Graphics", "Advanced Room Lighting", $01, $01)
    opt\Field50 = inigetfloat(optionfile, "Graphics", "Screen Gamma", 1.0, $01)
    opt\Field31 = 1.0
    opt\Field69 = inigetint(optionfile, "Graphics", "Particle Amount", $02, $01)
    opt\Field12 = inigetint(optionfile, "Graphics", "Texture LOD Bias", $02, $01)
    Select opt\Field12
        Case $00
            opt\Field38 = 0.8
        Case $01
            opt\Field38 = 0.4
        Case $02
            opt\Field38 = 0.0
        Case $03
            opt\Field38 = -0.4
        Case $04
            opt\Field38 = -0.8
    End Select
    opt\Field15 = inigetfloat(optionfile, "Graphics", "FOV", 60.0, $01)
    opt\Field64 = (opt\Field15 - 40.0)
    opt\Field79 = inigetint(optionfile, "Graphics", "Anisotropic Filtering", $02, $01)
    Select opt\Field79
        Case $00
            opt\Field60 = $00
        Case $01
            opt\Field60 = $02
        Case $02
            opt\Field60 = $04
        Case $03
            opt\Field60 = $08
        Case $04
            opt\Field60 = $10
    End Select
    opt\Field54 = inigetint(optionfile, "Graphics", "Security Camera Render Interval", $02, $01)
    Select opt\Field54
        Case $00
            opt\Field27 = 24.0
        Case $01
            opt\Field27 = 18.0
        Case $02
            opt\Field27 = 12.0
        Case $03
            opt\Field27 = 6.0
        Case $04
            opt\Field27 = 0.0
    End Select
    opt\Field76 = inigetint(optionfile, "Graphics", "Lighting", $02, $01)
    opt\Field63 = inigetint(optionfile, "Graphics", "Bloom", $01, $01)
    opt\Field70 = inigetint(optionfile, "Graphics", "Motion blur", $01, $01)
    opt\Field71 = inigetint(optionfile, "Graphics", "Volumetric lighting", $01, $01)
    opt\Field26 = inigetint(optionfile, "Graphics", "Color correction", $01, $01)
    opt\Field10 = inigetint(optionfile, "Graphics", "Ambient occlusion", $02, $01)
    opt\Field34 = inigetint(optionfile, "Graphics", "Texture quality", $03, $01)
    opt\Field44 = inigetint(optionfile, "Graphics", "Render distance", $02, $01)
    opt\Field77 = inigetfloat(optionfile, "Graphics", "Render scale", 1.0, $01)
    opt\Field6 = inigetint(optionfile, "Graphics", "Reflections quality", $02, $01)
    opt\Field47 = inigetint(optionfile, "Graphics", "Parallax occlusion", $01, $01)
    opt\Field17 = inigetint(optionfile, "Graphics", "HDR Render", $01, $01)
    opt\Field5 = inigetfloat(optionfile, "Audio", "Master Volume", 0.5, $01)
    opt\Field2 = opt\Field5
    opt\Field45 = inigetfloat(optionfile, "Audio", "Music Volume", 0.5, $01)
    opt\Field48 = 1.0
    opt\Field13 = inigetfloat(optionfile, "Audio", "Sound Volume", 0.5, $01)
    opt\Field59 = inigetfloat(optionfile, "Audio", "Voice Volume", 0.5, $01)
    opt\Field73 = inigetint(optionfile, "Audio", "SFX Release", $00, $01)
    opt\Field72 = opt\Field73
    opt\Field81 = inigetint(optionfile, "Audio", "User Track Setting", $00, $01)
    opt\Field53 = inigetint(optionfile, "Audio", "Enable Subtitles", $00, $01)
    opt\Field57 = inigetint(optionfile, "Audio", "Override Subtitle Color", $00, $01)
    opt\Field8 = inigetint(optionfile, "Audio", "Subtitles Color R", $FF, $01)
    opt\Field52 = inigetint(optionfile, "Audio", "Subtitles Color G", $FF, $01)
    opt\Field1 = inigetint(optionfile, "Audio", "Subtitles Color B", $FF, $01)
    opt\Field65 = inigetfloat(optionfile, "Controls", "Mouse Sensitivity", 0.0, $01)
    opt\Field0 = inigetint(optionfile, "Controls", "Invert Mouse By X-Axis", $00, $01)
    opt\Field18 = inigetint(optionfile, "Controls", "Invert Mouse By Y-Axis", $00, $01)
    opt\Field39 = inigetfloat(optionfile, "Controls", "Mouse Smoothing", 0.0, $01)
    key\Field5 = inigetint(optionfile, "Controls", "Up Key", $11, $01)
    key\Field7 = inigetint(optionfile, "Controls", "Left Key", $1E, $01)
    key\Field16 = inigetint(optionfile, "Controls", "Down Key", $1F, $01)
    key\Field6 = inigetint(optionfile, "Controls", "Right Key", $20, $01)
    key\Field12 = inigetint(optionfile, "Controls", "Sprint Key", $2A, $01)
    key\Field4 = inigetint(optionfile, "Controls", "Crouch Key", $1D, $01)
    key\Field8 = inigetint(optionfile, "Controls", "Blink Key", $30, $01)
    key\Field13 = inigetint(optionfile, "Controls", "Inventory Key", $0F, $01)
    key\Field15 = inigetint(optionfile, "Controls", "Save Key", $3F, $01)
    key\Field11 = inigetint(optionfile, "Controls", "Console Key", $3D, $01)
    key\Field1 = inigetint(optionfile, "Controls", "Screenshot Key", $3B, $01)
    key\Field19 = inigetint(optionfile, "Controls", "Lean Left Key", $10, $01)
    key\Field18 = inigetint(optionfile, "Controls", "Lean Right Key", $12, $01)
    key\Field2 = inigetint(optionfile, "Controls", "Interact Key", $12, $01)
    If (key\Field2 < $00) Then
        key\Field2 = $100
    EndIf
    opt\Field68 = inigetint(optionfile, "Advanced", "Enable HUD", $01, $01)
    opt\Field28 = inigetint(optionfile, "Advanced", "Enable Console", $00, $01)
    opt\Field62 = inigetint(optionfile, "Advanced", "Console Auto Opening", $00, $01)
    opt\Field51 = inigetint(optionfile, "Advanced", "Enable Achievement Popup", $01, $01)
    opt\Field35 = inigetint(optionfile, "Advanced", "Enable Auto Save", $01, $01)
    opt\Field49 = inigetint(optionfile, "Advanced", "Show FPS", $00, $01)
    opt\Field67 = inigetint(optionfile, "Advanced", "Frame Limit", $00, $01)
    opt\Field29 = (((Float opt\Field67) - 19.0) / 100.0)
    opt\Field23 = inigetint(optionfile, "Advanced", "Vignette Enabled", $00, $01)
    opt\Field11 = inigetint(optionfile, "Advanced", "Play Startup Videos", $01, $01)
    opt\Field40 = inigetint(optionfile, "Advanced", "Launcher Enabled", $01, $01)
    opt\Field24 = inigetstring(optionfile, "Multiplayer", "Voice device", "", $01)
    opt\Field75 = inigetstring(optionfile, "Multiplayer", "Nickname", X6000XBFZ2(), $01)
    opt\Field41 = inigetfloat(optionfile, "Multiplayer", "Voice Volume", 0.5, $01)
    opt\Field80 = inigetint(optionfile, "Multiplayer", "Automatic Voice", $00, $01)
    opt\Field42 = inigetstring(optionfile, "Multiplayer", "Customization", "", $01)
    key\Field9 = inigetint(optionfile, "Multiplayer", "Voice Key", $10, $01)
    key\Field17 = inigetint(optionfile, "Multiplayer", "Voice Radio Key", $2F, $01)
    key\Field10 = inigetint(optionfile, "Multiplayer", "Chat Key", $15, $01)
    key\Field14 = inigetint(optionfile, "Multiplayer", "Players List Key", $19, $01)
    key\Field3 = inigetint(optionfile, "Multiplayer", "Jump Key", $39, $01)
    opt\Field9 = inigetint(optionfile, "Multiplayer", "Agreement", $00, $01)
    opt\Field55 = inigetint(optionfile, "Multiplayer", "Fast Slots", $01, $01)
    opt\Field74 = inigetint(optionfile, "Multiplayer", "Show Hud", $01, $01)
    opt\Field4 = inigetint(optionfile, "Multiplayer", "Chat X", $00, $01)
    opt\Field78 = inigetint(optionfile, "Multiplayer", "Chat Y", $00, $01)
    opt\Field36 = inigetint(optionfile, "Multiplayer", "Chat Custom Pos", $00, $01)
    opt\Field33 = inigetfloat(optionfile, "Multiplayer", "Chat Height", 550.0, $01)
    opt\Field66 = inigetfloat(optionfile, "Multiplayer", "Chat Width", 600.0, $01)
    opt\Field43 = inigetint(optionfile, "Multiplayer", "Debug Messages", $01, $01)
    opt\Field21 = inigetint(optionfile, "Global", "Width", desktopwidth(), $01)
    opt\Field46 = inigetint(optionfile, "Global", "Height", desktopheight(), $01)
    opt\Field14 = inigetint(optionfile, "Global", "Display Mode", $01, $01)
    opt\Field32 = inigetint(optionfile, "Global", "GFX Driver", $01, $01)
    opt\Field3 = inigetint(optionfile, "Global", "Enable Intro", $01, $01)
    opt\Field22 = inigetstring(optionfile, "Global", "Language", "en", $01)
    opt\Field19 = inigetint(optionfile, "Global", "No Progress Bar", $00, $01)
    opt\Field20 = inigetint(optionfile, "Global", "Early Access", $00, $01)
    Return $00
End Function
