Function updatelauncher%(arg0.launcher)
    Local local0%
    Local local1%
    Local local2%[2]
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10$
    Local local11%
    Local local12%
    Local local13%
    Local local14$
    Local local15$
    Local local16%
    Local local17%
    Local local19#
    Local local20#
    menuscale = 1.0
    graphics3d($280, $1E0, $20, $02)
    YZZB280D2()
    T20FZ22BX0F(opt\Field37, $FFFFFFFF, $00, $00, $00, $00, $243)
    T20FZ22BX0F(opt\Field37, $FFFFFFFE, $00, $00, $00, $00, $243)
    setbuffer(backbuffer(), $00, $00)
    XD00026ZX2\Field0[$00] = loadfont_strict(("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Default", "File", "", $01)), (Int getfilelocalstring("Data\fonts.ini", "Default", "Size", "", $01)), $01)
    setfontex(XD00026ZX2\Field0[$00])
    menuwhite = loadimage_strict("GFX\Menu\menu_white.png")
    menugray = loadimage_strict("GFX\Menu\menu_gray.png")
    menublack = loadimage_strict("GFX\Menu\menu_black.png")
    TX4D0Z2BB = loadimage_strict("GFX\Menu\button_grad.png")
    For local0 = $00 To $01 Step $01
        buttonsfx[local0] = loadsound_strict((("SFX\Interact\Button" + (Str local0)) + ".ogg"))
    Next
    local2[$00] = loadanimimage_strict("GFX\Menu\media_click.png", $40, $40, $00, $04)
    local3 = (imagewidth(local2[$00]) Sar $01)
    local2[$01] = loadanimimage_strict("GFX\Menu\language_button.png", $28, $28, $00, $04)
    local4 = loadanimimage_strict("GFX\Menu\buttons.png", $15, $15, $00, $07)
    For local0 = $01 To arg0\Field3 Step $01
        local5 = $00
        For local1 = $00 To (arg0\Field3 - $01) Step $01
            If (((arg0\Field1[local1] = gfxmodewidth(local0)) And (arg0\Field4[local1] = gfxmodeheight(local0))) <> 0) Then
                local5 = $01
                Exit
            EndIf
        Next
        If (local5 = $00) Then
            If (opt\Field30 <> 0) Then
                If (((opt\Field21 = gfxmodewidth(local0)) And (opt\Field46 = gfxmodeheight(local0))) <> 0) Then
                    arg0\Field2 = arg0\Field0
                EndIf
                arg0\Field1[arg0\Field0] = gfxmodewidth(local0)
                arg0\Field4[arg0\Field0] = gfxmodeheight(local0)
                arg0\Field0 = (arg0\Field0 + $01)
            ElseIf (((gfxmodewidth(local0) >= $320) And (gfxmodeheight(local0) >= $258)) <> 0) Then
                If (((opt\Field21 = gfxmodewidth(local0)) And (opt\Field46 = gfxmodeheight(local0))) <> 0) Then
                    arg0\Field2 = arg0\Field0
                EndIf
                arg0\Field1[arg0\Field0] = gfxmodewidth(local0)
                arg0\Field4[arg0\Field0] = gfxmodeheight(local0)
                arg0\Field0 = (arg0\Field0 + $01)
            EndIf
        EndIf
    Next
    apptitle(getlocalstring("mplauncher", "title"), "")
    local6 = $00
    local7 = $00
    local8 = $00
    local9 = $00
    local10 = ""
    local11 = $00
    Repeat
        cls()
        mouseposx = (Float mousex())
        mouseposy = (Float mousey())
        TDD0Z6BXB6\Field7 = mousehit($01)
        color($FF, $FF, $FF, $FF)
        If (launcherbg = $00) Then
            launcherbg = loadimage_strict("GFX\Menu\launcher.png")
        EndIf
        drawblock(launcherbg, $00, $00, $00)
        textex($14, $B1, getlocalstring("launcher", "resolution"), $00, $00)
        local12 = $28
        local13 = $D3
        For local0 = $00 To (arg0\Field0 - $01) Step $01
            color($FF, $FF, $FF, $FF)
            If (arg0\Field2 = local0) Then
                rect((local12 - $01), (local13 - $05), $64, $14, $00)
            EndIf
            textex(local12, local13, (((Str arg0\Field1[local0]) + "x") + (Str arg0\Field4[local0])), $00, $00)
            If (mouseon((local12 - $01), (local13 - $05), $64, $14) <> 0) Then
                color($64, $64, $64, $FF)
                rect((local12 - $01), (local13 - $05), $64, $14, $00)
                If (TDD0Z6BXB6\Field7 <> 0) Then
                    arg0\Field2 = local0
                EndIf
            EndIf
            local13 = (local13 + $14)
            If (local13 >= $145) Then
                local13 = $D3
                local12 = (local12 + $64)
            EndIf
        Next
        color($FF, $FF, $FF, $FF)
        textex($1C7, $B1, getlocalstring("launcher", "gfx"), $00, $00)
        renderframe($1C7, $C5, $9B, $1E, $00, $00, $00, $01)
        If (opt\Field32 = $01) Then
            local14 = getlocalstring("launcher", "gfx.primary")
        Else
            local14 = format(getlocalstring("launcher", "gfx.num"), (Str (opt\Field32 - $01)), "%s")
        EndIf
        textex($214, $CF, local14, $01, $00)
        If (updatelauncherbutton($25D, $C5, $1E, $1E, ">", $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            opt\Field32 = (opt\Field32 + $01)
        EndIf
        If (opt\Field32 > opt\Field61) Then
            opt\Field32 = $01
        EndIf
        textex($1C7, $EB, getlocalstring("launcher", "display"), $00, $00)
        local16 = desktopwidth()
        local17 = desktopheight()
        Select opt\Field14
            Case $00
                local15 = getlocalstring("launcher", "display.fullscreen")
            Case $01
                local15 = getlocalstring("launcher", "display.borderless")
            Case $02
                local15 = getlocalstring("launcher", "display.windowed")
        End Select
        textex($1DE, $15B, format(format(getlocalstring("launcher", "currres"), (Str arg0\Field1[arg0\Field2]), "{0}"), (Str arg0\Field4[arg0\Field2]), "{1}"), $01, $00)
        renderframe($1C7, $FE, $9B, $1E, $00, $00, $00, $01)
        textex($214, $108, local15, $01, $00)
        If (updatelauncherbutton($25D, $FE, $1E, $1E, ">", $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            opt\Field14 = ((opt\Field14 + $01) Mod $03)
        EndIf
        If (getgraphicslevel() >= $64) Then
            opt\Field14 = (Int max((Float opt\Field14), 1.0))
        EndIf
        local19 = (Float fontwidth())
        local20 = (Float fontheight())
        If (mouseon($1C7, $C5, $9B, $1E) <> 0) Then
            local8 = (Int (mouseposx + 5.0))
            local9 = (Int (mouseposy + 10.0))
            local10 = converttoutf8(gfxdrivername(opt\Field32))
            local11 = stringwidth(local10)
            If (640.0 < ((Float (local8 + local11)) + local19)) Then
                local8 = ((local8 - local11) - $0A)
            EndIf
            renderframe(local8, local9, (Int ((Float local11) + local19)), (Int (local20 + 16.0)), $00, $00, $00, $01)
            textex((local8 + $08), (local9 + $08), local10, $00, $00)
        EndIf
        text($32, $161, getlocalstring("launcher", "launcher"), $00, $00)
        opt\Field40 = updatelaunchertick($14, $15B, opt\Field40, $00)
        If (mouseon($14, $18A, $40, $40) <> 0) Then
            rect($13, $189, $42, $42, $00)
            textex(($14 + local3), $176, "DISCORD", $01, $00)
            If (TDD0Z6BXB6\Field7 <> 0) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                execfile_strict("https://discord.gg/yz32AQcCzw")
            EndIf
        EndIf
        drawblock(local2[$00], $14, $18A, $00)
        If (mouseon($64, $18A, $40, $40) <> 0) Then
            rect($63, $189, $42, $42, $00)
            textex(($64 + local3), $176, "PATREON", $01, $00)
            If (TDD0Z6BXB6\Field7 <> 0) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                execfile_strict("https://www.patreon.com/scpcbmultiplayer")
            EndIf
        EndIf
        drawblock(local2[$00], $64, $18A, $00)
        If (mouseon($B4, $18A, $40, $40) <> 0) Then
            rect($B3, $189, $42, $42, $01)
            textex(($B4 + local3), $176, "YOUTUBE", $01, $00)
            If (TDD0Z6BXB6\Field7 <> 0) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                execfile_strict("https://www.youtube.com/@Euclid-Labs")
            EndIf
        EndIf
        drawblock(local2[$00], $B4, $18A, $00)
        If (mouseon($104, $18A, $40, $40) <> 0) Then
            rect($103, $189, $42, $42, $02)
            textex(($104 + local3), $176, "WIKI", $01, $00)
            If (TDD0Z6BXB6\Field7 <> 0) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                execfile_strict("https://scpcbultimatereborn.miraheze.org/wiki/Main_Page")
            EndIf
        EndIf
        drawblock(local2[$00], $104, $18A, $00)
        If (local7 <> $00) Then
            color($FF, $00, $00, $FF)
            drawimage(local2[$01], $1C7, $126, $00)
            textex($1F4, $13A, getlocalstring("launcher", "language.failed"), $00, $01)
            If ((millisecs() - local7) > $1388) Then
                local7 = $00
            EndIf
        Else
            If (keydown($1D) <> 0) Then
                local15 = getlocalstring("launcher", "language.iter")
            Else
                local15 = getlocalstring("launcher", "language")
            EndIf
            textex($1F4, $13A, local15, $00, $01)
            If (mouseon($1C7, $126, $28, $28) <> 0) Then
                If (keydown($1D) <> 0) Then
                    drawimage(local2[$01], $1C7, $126, $00)
                    If (TDD0Z6BXB6\Field7 <> 0) Then
                        playsound_strict(buttonsfx[$00], $00, $00)
                        If (filetype("Localization") = $02) Then
                            setlanguage(F8D2BB024("Localization", opt\Field22, "en"), $00)
                            freeimage(launcherbg)
                            launcherbg = $00
                            iniwritestring(optionfile, "Global", "Language", opt\Field22, $01)
                        EndIf
                    EndIf
                Else
                    drawimage(local2[$01], $1C7, $126, $00)
                    If (TDD0Z6BXB6\Field7 <> 0) Then
                        playsound_strict(buttonsfx[$00], $00, $00)
                        If (updatelanguageselector() <> 0) Then
                            local7 = millisecs()
                        EndIf
                    EndIf
                EndIf
            Else
                drawimage(local2[$01], $1C7, $126, $00)
            EndIf
        EndIf
        If (updatelauncherbutton($154, $177, $A5, $1E, getlocalstring("launcher", "report"), $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            execfile_strict("https://discord.gg/yz32AQcCzw")
        EndIf
        If (updatelauncherbutton($154, $1AE, $A5, $1E, getlocalstring("launcher", "changelog"), $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            execfile_strict("https://store.steampowered.com/news/app/3257000")
        EndIf
        If (updatelauncherbutton($208, $177, $64, $1E, getlocalstring("launcher", "launch"), $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            opt\Field21 = arg0\Field1[arg0\Field2]
            opt\Field46 = arg0\Field4[arg0\Field2]
            graphicwidthfloat = (Float opt\Field21)
            graphicheightfloat = (Float opt\Field46)
            Exit
        EndIf
        If (updatelauncherbutton($208, $1AE, $64, $1E, getlocalstring("launcher", "exit"), $00, $00, $00, $FF, $FF, $FF) <> 0) Then
            local6 = $01
            Exit
        EndIf
        flip($01)
    Forever
    iniwritestring(optionfile, "Global", "Width", (Str arg0\Field1[arg0\Field2]), $01)
    iniwritestring(optionfile, "Global", "Height", (Str arg0\Field4[arg0\Field2]), $01)
    iniwritestring(optionfile, "Advanced", "Launcher Enabled", (Str opt\Field40), $01)
    iniwritestring(optionfile, "Global", "Display Mode", (Str opt\Field14), $01)
    iniwritestring(optionfile, "Global", "GFX Driver", (Str opt\Field32), $01)
    iniwritestring(optionfile, "Global", "No Progress Bar", (Str opt\Field19), $01)
    For local0 = $00 To $01 Step $01
        freeimage(local2[local0])
        local2[local0] = $00
    Next
    freeimage(local4)
    local4 = $00
    mouseposx = 0.0
    mouseposy = 0.0
    TDD0Z6BXB6\Field7 = $00
    freeimage(launcherbg)
    launcherbg = $00
    freeimage(menublack)
    menublack = $00
    freeimage(menugray)
    menugray = $00
    freeimage(menuwhite)
    menuwhite = $00
    freesound_strict(buttonsfx[$00])
    buttonsfx[$00] = $00
    freesound_strict(buttonsfx[$01])
    buttonsfx[$01] = $00
    endgraphics()
    If (local6 <> 0) Then
        end()
    EndIf
    Return $00
End Function
