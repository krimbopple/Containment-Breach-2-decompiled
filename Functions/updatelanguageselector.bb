Function updatelanguageselector%()
    Local local0$
    Local local1$
    Local local2$
    Local local3.listlanguage
    Local local4%
    Local local5$
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16.listlanguage
    Local local17.listlanguage
    Local local18%
    Local local19%
    Local local20%
    Local local21.TXB0X08F8BX
    Local local23#
    Local local24#
    Local local25%
    Local local26$
    Local local28%
    Local local29$
    Local local30$
    Local local31$
    Local local32$
    Local local33$
    Local local34$
    Local local35$
    Local local36$
    Local local37%
    Local local38%
    Local local39%
    Local local40%
    countryflags = _CreateS2IMap()
    local1 = getuserlanguage()
    If (((local1 = "zh-CN") Lor (local1 = "ru-RU")) <> 0) Then
        local0 = "https://files.ziyuebot.cn/cbue/"
    Else
        local0 = "https://files.ziyuesinicization.site/cbue/"
    EndIf
    local2 = "Localization\"
    local4 = _JsonParseFromFile((local2 + "languages.json"))
    If (_JsonHasParseError(local4) = $00) Then
        local6 = _JsonGetArray(local4)
        local7 = _JsonGetArraySize(local6)
        For local8 = $00 To (local7 - $01) Step $01
            local9 = _JsonGetArrayValue(local6, local8)
            local3 = (New listlanguage)
            local3\Field7 = _JsonGetString(_JsonGetValue(local9, "name"))
            local3\Field6 = _JsonGetString(_JsonGetValue(local9, "id"))
            local3\Field2 = _JsonGetString(_JsonGetValue(local9, "author"))
            local3\Field1 = _JsonGetString(_JsonGetValue(local9, "update"))
            local3\Field4 = _JsonIsNull(_JsonGetValue(local9, "size"))
            local3\Field0 = _JsonGetBool(_JsonGetValue(local9, "perfect"))
            local3\Field8 = _JsonGetString(_JsonGetValue(local9, "flag"))
            local3\Field3 = _JsonGetInt(_JsonGetValue(local9, "size"))
            local3\Field5 = _JsonGetString(_JsonGetValue(local9, "compatible"))
            If (filetype(((local2 + "flags/") + local3\Field8)) <> $01) Then
                Steam_DownloadFile(((local0 + "flags/") + local3\Field8), ((local2 + "flags/") + local3\Field8), $00, $7D0)
            EndIf
            If (_S2IMapContains(countryflags, local3\Field8) = $00) Then
                local10 = loadimage(((local2 + "flags\") + local3\Field8), $00)
                _S2IMapSet(countryflags, local3\Field8, local10)
            EndIf
            If (_S2IMapContains(countryflags, local3\Field8) = $00) Then
                Return $01
            EndIf
        Next
    Else
        Return $01
    EndIf
    setbuffer(backbuffer(), $00, $00)
    cls()
    flip($01)
    local12 = createimage($1C4, $FE, $01, $00)
    local13 = createtexture($200, $200, $501, $01)
    local14 = loadanimimage_strict("GFX\Menu\buttons.png", $15, $15, $00, $07)
    local15 = (fontheight() Sar $01)
    local16 = Null
    local17 = Null
    local18 = $00
    local19 = $00
    local20 = $00
    apptitle(getlocalstring("mplanguage", "title"), "")
.section__521
    Repeat
        mouseposx = (Float mousex())
        mouseposy = (Float mousey())
        TDD0Z6BXB6\Field7 = mousehit($01)
        TDD0Z6BXB6\Field1 = mousedown($01)
        TDD0Z6BXB6\Field8 = mousedown($02)
        _Steam_Update()
        Select local18
            Case $02
                
                Steam_DownloadFile((("https://weblate.ziyuesinicization.site/api/translations/scpcb-ue/local-ini/" + eax_0175) + "/file/"), (local2 + "/local.ini"), $00, $1388)
                
                Steam_DownloadFile((("https://weblate.ziyuesinicization.site/api/translations/scpcb-ue/achievements-jsonc/" + eax_0192) + "/file/"), (local2 + "/achievements.jsonc"), $00, $1388)
                
                Steam_DownloadFile((("https://weblate.ziyuesinicization.site/api/translations/scpcbm-reborn/mp-local-ini/" + eax_01AF) + "/file/"), (local2 + "/MP_local.ini"), $00, $1388)
                
                If (eax_01C4 = $00) Then
                    
                    local21 = Steam_DownloadFile(((local0 + eax_01D0) + ".zip"), (local2 + "/local.zip"), $00, $00)
                    If (local21 = Null) Then
                        local18 = $00
                        Goto section__521
                    EndIf
                EndIf
                local18 = $03
            Case $05
                
                createdir(("Localization\" + eax_01E9))
                
                If (eax_01F4 = $00) Then
                    
                    unzip((local2 + "/local.zip"), ("Localization\" + eax_0200), "")
                EndIf
                
                createdir((("Localization\" + eax_0211) + "/Data"))
                
                copyfile((local2 + "/local.ini"), (("Localization\" + eax_0228) + "/Data/local.ini"))
                
                copyfile((local2 + "/achievements.jsonc"), (("Localization\" + eax_0244) + "/Data/achievements.jsonc"))
                
                copyfile((local2 + "/MP_local.ini"), (("Localization\" + eax_0260) + "/Data/MP_local.ini"))
                local20 = millisecs()
                local18 = $08
            Case $07
                deletefolder(("Localization\" + local16\Field6))
                local20 = millisecs()
                local18 = $08
        End Select
        If (local18 = $08) Then
            If ((millisecs() - local20) > $5DC) Then
                local18 = $00
            EndIf
        EndIf
        setbuffer(backbuffer(), $00, $00)
        cls()
        color($FF, $FF, $FF, $FF)
        If (local11 = $00) Then
            local11 = loadimage_strict("GFX\Menu\Language.png")
        EndIf
        drawblock(local11, $00, $00, $00)
        rect($1DF, $C3, $9B, $6E, $00)
        If (local25 >= $0D) Then
            local24 = (200.0 - ((20.0 * scrollmenuheight) * scrollbary))
            setbuffer(texturebuffer(local13, $00), $00, $00)
            drawimage(local11, $FFFFFFEC, $FFFFFF3D, $00)
            local25 = $00
            For local3 = Each listlanguage
                color($FF, $FF, $FF, $FF)
                limittextwithimage((((local3\Field7 + "(") + local3\Field6) + ")"), $02, (Int (local24 - 195.0)), $1B0, _S2IMapGet(countryflags, local3\Field8), $00)
                If (mouseon($14, (Int (local24 - (Float local15))), $1B0, $14) <> 0) Then
                    ebx_00C3 = (Int ((local24 - 195.0) - (Float local15)))
                    drawimage(local14, $19A, $05, $00)
                    If (mouseon($1AE, (Int (local24 - (Float local15))), $15, $15) <> 0) Then
                        color($96, $96, $96, $FF)
                        rect($19A, (Int ((local24 - 195.0) - (Float local15))), $14, ebx_00C3, $00, 0.0)
                        local17 = local3
                    EndIf
                EndIf
                If (local3\Field6 = opt\Field22) Then
                    color($C8, $00, $00, $FF)
                    rect($00, (Int ((local24 - 195.0) - (Float local15))), $1AE, $14, $00)
                EndIf
                If (((local16 <> Null) And (local3 = local16)) <> 0) Then
                    color($3C, $3C, $3D, $FF)
                    rect($00, (Int ((local24 - 195.0) - (Float local15))), $1AE, $14, $00)
                EndIf
                If (mouseon($14, (Int (local24 - (Float local15))), $1B0, $14) <> 0) Then
                    color($96, $96, $96, $FF)
                    rect($00, (Int ((local24 - 195.0) - (Float local15))), $1AE, $14, $00)
                    If (TDD0Z6BXB6\Field7 <> 0) Then
                        local16 = local3
                    EndIf
                EndIf
                local24 = (local24 + 20.0)
                local25 = (local25 + $01)
            Next
            copyrectstretch($00, $00, imagewidth(local12), imageheight(local12), $00, $00, bufferwidth(imagebuffer(local12, $00)), bufferheight(imagebuffer(local12, $00)), texturebuffer(local13, $00), imagebuffer(local12, $00))
            setbuffer(backbuffer(), $00, $00)
            drawblock(local12, $14, $C3, $00)
            color($0A, $0A, $0A, $FF)
            rect($1C4, $C3, $14, $FE, $00)
            scrollmenuheight = (Float (local25 - $0C))
            scrollbary = updatelauncherscrollbar($14, $FE, $1C4, (Int (((254.0 - (254.0 - (4.0 * scrollmenuheight))) * scrollbary) + 195.0)), $14, (Int (254.0 - (4.0 * scrollmenuheight))), scrollbary, $01)
        Else
            local24 = 200.0
            local25 = $00
            For local3 = Each listlanguage
                color($FF, $FF, $FF, $FF)
                limittextwithimage((((local3\Field7 + "(") + local3\Field6) + ")"), $15, (Int local24), $1B0, _S2IMapGet(countryflags, local3\Field8), $00)
                If (mouseon($14, (Int (local24 - (Float local15))), $1AE, $14) <> 0) Then
                    ebx_0106 = (Int (local24 - 4.0))
                    drawimage(local14, $1AE, $05, $00)
                    If (mouseon($1AE, (Int (local24 - 4.0)), $15, $15) <> 0) Then
                        color($96, $96, $96, $FF)
                        rect($1AE, (Int (local24 - 4.0)), $14, ebx_0106, $00)
                        local17 = local3
                    EndIf
                EndIf
                If (local3\Field6 = opt\Field22) Then
                    color($C8, $00, $00, $FF)
                    rect($14, (Int (local24 - (Float local15))), $1AE, $14, $00)
                EndIf
                If (((local16 <> Null) And (local3 = local16)) <> 0) Then
                    color($3C, $3C, $3D, $FF)
                    rect($14, (Int (local24 - (Float local15))), $1AE, $14, $00)
                EndIf
                If (mouseon($14, (Int (local24 - (Float local15))), $1B0, $14) <> 0) Then
                    color($96, $96, $96, $FF)
                    rect($14, (Int (local24 - (Float local15))), $1AE, $14, $00)
                    If (TDD0Z6BXB6\Field7 <> 0) Then
                        local16 = local3
                    EndIf
                EndIf
                local24 = (local24 + 20.0)
                local25 = (local25 + $01)
            Next
            scrollmenuheight = (Float local25)
        EndIf
        local26 = getlocalstring("language", "more")
        color($64, $64, $64, $FF)
        Select local18
            Case $01
                local26 = getlocalstring("language", "downloading")
                If (opt\Field19 = $00) Then
                    updatelauncherbutton($1DF, $13B, $9B, $1E, "0%", $00, $00, $01, $FF, $FF, $FF)
                EndIf
                local18 = $02
            Case $02
                
                If (eax_0373 <> 0) Then
                    local18 = $04
                Else
                    local18 = $03
                EndIf
            Case $03
                If (((opt\Field19 = $00) And (local21 <> Null)) <> 0) Then
                    
                    local26 = format(format(getlocalstring("language", "downloading.filesize"), simplefilesize(GUESSEDgetupdatelanguageselector(local21)), "{0}"), simplefilesize(eax_0394), "{1}")
                    
                    updatelauncherbutton($1DF, $13B, $9B, $1E, ((Str (Int ceil((((Float GUESSEDgetupdatelanguageselector(local21)) / (Float eax_03A1)) * 100.0)))) + "%"), $00, $00, $01, $FF, $FF, $FF)
                Else
                    local18 = $04
                EndIf
            Case $04
                local26 = getlocalstring("language", "unpacking")
                updatelauncherbutton($1DF, $13B, $9B, $1E, "100%", $00, $00, $01, $FF, $FF, $FF)
                local18 = $05
            Case $06
                local26 = getlocalstring("language", "uninstalling")
                local18 = $07
            Case $08
                local26 = getlocalstring("language", "done")
        End Select
        color($00, $00, $01, $FF)
        rowtext(local26, $1E1, $C7, $97, $66, $00, 1.0)
        If (local16 <> Null) Then
            If (local16\Field6 = opt\Field22) Then
                If (updatelauncherbuttonwithimage($1DF, $16D, $9B, $1E, getlocalstring("language", "contribute"), $00, local14, $04, (Int isdownloadinglanguage(local18))) <> 0) Then
                    execfile_strict("https://github.ziyuesinicization.site/Jabka666/scpcb-ue-my/wiki/How-to-contribute-a-language")
                EndIf
            ElseIf (local16\Field7 = "English") Then
                If (updatelauncherbuttonwithimage($1DF, $16D, $9B, $1E, getlocalstring("language", "set"), $00, local14, $02, (Int isdownloadinglanguage(local18))) <> 0) Then
                    setlanguage(local16\Field6, $01)
                    freeimage(local11)
                    local11 = $00
                    iniwritestring(optionfile, "Global", "Language", opt\Field22, $01)
                EndIf
            ElseIf (filetype(("Localization\" + local16\Field6)) = $02) Then
                If (local16\Field6 <> opt\Field22) Then
                    If (updatelauncherbuttonwithimage($1DF, $16D, $9B, $1E, getlocalstring("language", "set"), $00, local14, $02, (Int isdownloadinglanguage(local18))) <> 0) Then
                        setlanguage(local16\Field6, $01)
                        freeimage(local11)
                        local11 = $00
                        iniwritestring(optionfile, "Global", "Language", opt\Field22, $01)
                    EndIf
                EndIf
            Else
                updatelauncherbuttonwithimage($1DF, $16D, $9B, $1E, getlocalstring("language", "download"), $00, local14, $01, (Int isdownloadinglanguage(local18)))
            EndIf
        EndIf
        If (updatelauncherbuttonwithimage($1DF, $19F, $9B, $1E, getlocalstring("menu", "back"), $00, local14, $00, (Int isdownloadinglanguage(local18))) <> 0) Then
            Exit
        EndIf
        If (local17 <> Null) Then
            local29 = format(getlocalstring("language", "name"), local17\Field7, "%s")
            local30 = format(getlocalstring("language", "id"), local17\Field6, "%s")
            local31 = ""
            local32 = ""
            local33 = ""
            local34 = ""
            local35 = ""
            local36 = ""
            local37 = fontwidth()
            local38 = fontheight()
            local39 = (Int ((Float local38) * 4.5))
            color($FF, $FF, $FF, $FF)
            If (local17\Field6 <> "en") Then
                local33 = format(getlocalstring("language", "author"), local17\Field2, "%s")
                local34 = format(getlocalstring("language", "full"), getlocalstring("language", "yes"), "%s")
                local35 = format(getlocalstring("language", "full"), getlocalstring("language", "no"), "%s")
                local36 = format(getlocalstring("language", "compatible"), ("v" + local17\Field5), "%s")
                If (local17\Field4 <> 0) Then
                    local39 = (local38 Shl $03)
                Else
                    local31 = format(getlocalstring("language", "size"), simplefilesize(local17\Field3), "%s")
                    local32 = format(getlocalstring("language", "lastmod"), local17\Field1, "%s")
                    local39 = (local38 * $0D)
                EndIf
            EndIf
            local40 = (Int max(max(max(max(max(max(max((Float stringwidth(local29)), (Float stringwidth(local30))), (Float stringwidth(local33))), (Float stringwidth(local34))), (Float stringwidth(local31))), (Float stringwidth(local36))), (Float stringwidth(local35))), (Float stringwidth(local32))))
            local23 = (mouseposx + 10.0)
            local24 = (mouseposy + 10.0)
            If (640.0 < ((local23 + (Float local40)) + (Float local37))) Then
                local23 = ((local23 - (Float local40)) - 10.0)
            EndIf
            If (480.0 < ((local24 + (Float local39)) + (Float local38))) Then
                local24 = ((local24 - (Float local39)) - 15.0)
            EndIf
            renderframe((Int local23), (Int local24), (local40 + local37), local39, $00, $00, $00, $01)
            local23 = (local23 + 5.0)
            textex((Int local23), (Int (local24 + 8.0)), local29, $00, $00)
            textex((Int local23), (Int (local24 + 23.0)), local30, $00, $00)
            If (local17\Field6 <> "en") Then
                textex((Int local23), (Int (local24 + 38.0)), local33, $00, $00)
                If (local17\Field0 <> 0) Then
                    dualcolortext((Int local23), (Int (local24 + 53.0)), format(getlocalstring("language", "full"), "", "%s"), getlocalstring("language", "yes"), $FF, $FF, $FF, $00, $C8, $00)
                Else
                    dualcolortext((Int local23), (Int (local24 + 53.0)), format(getlocalstring("language", "full"), "", "%s"), getlocalstring("language", "no"), $FF, $FF, $FF, $C8, $00, $00)
                EndIf
                If (local17\Field4 = $00) Then
                    If (local17\Field5 = "1.6") Then
                        dualcolortext((Int local23), (Int (local24 + 68.0)), format(getlocalstring("language", "compatible"), "", "%s"), ("v" + local17\Field5), $FF, $FF, $FF, $00, $C8, $00)
                    Else
                        dualcolortext((Int local23), (Int (local24 + 68.0)), format(getlocalstring("language", "compatible"), "", "%s"), ("v" + local17\Field5), $FF, $FF, $FF, $C8, $00, $00)
                    EndIf
                    textex((Int local23), (Int (local24 + 83.0)), local32, $00, $00)
                    textex((Int local23), (Int (local24 + 98.0)), local31, $00, $00)
                EndIf
            EndIf
            If (TDD0Z6BXB6\Field7 <> 0) Then
                execfile("https://github.ziyuesinicization.site/Jabka666/scpcb-ue-my/wiki/Language-List-of-Ultimate-Edition")
            EndIf
        EndIf
        local17 = Null
        flip($01)
    Forever
    TDD0Z6BXB6\Field7 = $00
    TDD0Z6BXB6\Field1 = $00
    scrollbary = 0.0
    scrollmenuheight = 0.0
    For local3 = Each listlanguage
        freeimage(_S2IMapGet(countryflags, local3\Field8))
        Delete local3
    Next
    _DestroyS2IMap(countryflags)
    countryflags = $00
    freeimage(local12)
    local12 = $00
    freeimage(local11)
    local11 = $00
    freeimage(local14)
    local14 = $00
    freeimage(launcherbg)
    launcherbg = $00
    freetexture(local13)
    apptitle(getlocalstring("mplauncher", "title"), "")
    Return $00
End Function
