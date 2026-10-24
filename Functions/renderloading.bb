Function renderloading%(arg0#, arg1$, arg2%, arg3#)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10$
    Local local11%
    catcherrors((((("RenderLoading(" + (Str (Int floor(arg0)))) + ", ") + arg1) + ")"))
    local0 = rndseed()
    local4 = TD0DFDZ4XX(loadingscreens)
    hidepointer()
    If (0.0 = arg0) Then
        If (loadingimage = $00) Then
            descriptionindex = $00
            selectedloadingscreens = D8XX4X0D0(loadingscreens, rand($00, (local4 - $01)))
            loadingscreentitle = TX240XXB6Z6(TX0Z2Z4F86D(selectedloadingscreens, "title"))
            If (TF46ZF6DB6(TX0Z2Z4F86D(selectedloadingscreens, "descriptions")) <> 0) Then
                If (descriptiondoc <> $00) Then
                    Y00DFZDDF6(descriptiondoc)
                EndIf
                descriptiondoc = TB0Z440FF8(((("[" + chr($22)) + chr($22)) + "]"))
                descriptions = TD4644B68Z(descriptiondoc)
            Else
                descriptions = TD4644B68Z(TX0Z2Z4F86D(selectedloadingscreens, "descriptions"))
            EndIf
            imagealignx = TX240XXB6Z6(TX0Z2Z4F86D(selectedloadingscreens, "align_x"))
            imagealigny = TX240XXB6Z6(TX0Z2Z4F86D(selectedloadingscreens, "align_y"))
            TX62X4DD402 = 0.0
            EF28D22B2 = scaleimageex(loadimage_strict("GFX\Menu\QuickLoading.png"), (menuscale * 2.3), (menuscale * 2.3), $01)
            loadingimage = scaleimageex(loadimage_strict(("GFX\LoadingScreens\" + TX240XXB6Z6(TX0Z2Z4F86D(selectedloadingscreens, "image")))), menuscale, menuscale, $01)
            maskimage(loadingimage, $00, $00, $00)
            If (TX8B6FFF244(TX0Z2Z4F86D(selectedloadingscreens, "background")) <> 0) Then
                If (loadingback = $00) Then
                    loadingback = scaleimageex(loadimage_strict("GFX\LoadingScreens\loading_back.png"), menuscale, menuscale, $01)
                    maskimage(loadingback, $00, $00, $00)
                    loadingbackwidth = (imagewidth(loadingback) Sar $01)
                    loadingbackheight = (imageheight(loadingback) Sar $01)
                EndIf
            EndIf
            If (loadingscreentitle = "CWM") Then
                playsound_strict(loadtempsound("SFX\SCP\990\cwm0.cwm"), $00, $00)
            EndIf
        EndIf
    ElseIf (loadingimage = $00) Then
        seedrnd(local0)
        Return $00
    EndIf
    T8ZB864XB0 = arg0
    If (arg1 <> "") Then
        X4Z088FBZ0 = arg1
    EndIf
    E2F4Z648F = arg2
    AZ4Z48BBX = arg3
    local3 = $01
    local5 = TD0DFDZ4XX(descriptions)
    local6 = (loadingscreentitle = "CWM")
    seedrnd(millisecs())
    Repeat
        clscolor($00, $00, $00, $FF)
        cls()
        If (20.0 < arg0) Then
            updatemusic()
        EndIf
        TX4F8F428F = (TX4F8F428F + 1.147541)
        If (420.0 < TX4F8F428F) Then
            If (descriptionindex < (local5 - $01)) Then
                descriptionindex = (descriptionindex + $01)
            Else
                descriptionindex = $00
            EndIf
            TX4F8F428F = 0.0
        EndIf
        If (loadingback <> $00) Then
            drawblock(loadingback, (TDD0Z6BXB6\Field6 - loadingbackwidth), $00, $00)
        EndIf
        If (imagealignx = "center") Then
            local1 = (TDD0Z6BXB6\Field6 - (imagewidth(loadingimage) Sar $01))
        ElseIf (imagealignx = "right") Then
            local1 = (opt\Field21 - imagewidth(loadingimage))
        Else
            local1 = $00
        EndIf
        If (imagealigny = "center") Then
            local2 = (TDD0Z6BXB6\Field9 - (imageheight(loadingimage) Sar $01))
        ElseIf (imagealigny = "bottom") Then
            local2 = (opt\Field46 - imageheight(loadingimage))
        Else
            local2 = $00
        EndIf
        drawimage(loadingimage, local1, local2, $00)
        local7 = (Int (450.0 * menuscale))
        local8 = (Int (15.0 * menuscale))
        local1 = (TDD0Z6BXB6\Field6 - (local7 Sar $01))
        local2 = (Int ((Float opt\Field46) - (75.0 * menuscale)))
        color($46, $46, $46, $80)
        rotateimage(EF28D22B2, TX62X4DD402)
        imagewidth(EF28D22B2)
        drawimage(EF28D22B2, (Int (((Float TDD0Z6BXB6\Field9) - ((Float imageheight(EF28D22B2)) / 2.0)) + (300.0 * menuscale))), $00, $01)
        color($FF, $FF, $FF, $FF)
        renderbar(blinkmeterimg, local1, local2, local7, local8, arg0, 100.0, $96, $96, $96, $00)
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[$0A])
        textex(((local7 Sar $01) + local1), (Int ((Float opt\Field46) - (95.0 * menuscale))), ((Str (Int floor(arg0))) + "%"), $01, $01)
        setfontex(XD00026ZX2\Field0[$00])
        If (local6 <> 0) Then
            If (local3 <> 0) Then
                If (((((Int arg0) = $64) And (0.0 = XZDBX4X4FD(arg0))) And (initializeintromovie = $00)) <> 0) Then
                    playsound_strict(loadtempsound("SFX\SCP\990\cwm1.cwm"), $00, $00)
                EndIf
            EndIf
            local10 = ""
            local11 = rand($02, $09)
            For local9 = $00 To local11 Step $01
                local10 = (local10 + chr(rand($30, $7A)))
            Next
            setfontex(XD00026ZX2\Field0[$01])
            textex(TDD0Z6BXB6\Field6, (Int ((Float TDD0Z6BXB6\Field9) - (450.0 * menuscale))), local10, $01, $01)
            If (0.0 = arg0) Then
                If (rand($05, $01) = $01) Then
                    Select rand($02, $01)
                        Case $01
                            cwmtext = format(getlocalstring("menu", "happend"), currenttime(), "%s")
                        Case $02
                            cwmtext = currenttime()
                    End Select
                Else
                    Select rand($10, $01)
                        Case $01
                            cwmtext = getlocalstring("menu", "990_1")
                        Case $02
                            cwmtext = getlocalstring("menu", "990_2")
                        Case $03
                            cwmtext = getlocalstring("menu", "990_3")
                        Case $04
                            cwmtext = "eof9nsd3jue4iwe1fgj"
                        Case $05
                            cwmtext = getlocalstring("menu", "990_4")
                        Case $06
                            cwmtext = getlocalstring("menu", "990_5")
                        Case $07
                            cwmtext = "???____??_???__????n?"
                        Case $08,$09
                            cwmtext = getlocalstring("menu", "990_6")
                        Case $0A
                            cwmtext = "???????????"
                        Case $0B
                            cwmtext = getlocalstring("menu", "990_7")
                        Case $0C
                            cwmtext = getlocalstring("menu", "990_8")
                        Case $0D
                            cwmtext = getlocalstring("menu", "990_9")
                        Case $0E
                            cwmtext = getlocalstring("menu", "990_10")
                        Case $0F
                            cwmtext = getlocalstring("menu", "990_11")
                        Case $10
                            cwmtext = getlocalstring("menu", "990_12")
                    End Select
                EndIf
            EndIf
            local10 = cwmtext
            local11 = (len(cwmtext) - rand($05, $01))
            For local9 = $00 To rand($0A, $0F) Step $01
                local10 = replace(cwmtext, mid(cwmtext, rand((len(local10) - $01), $01), $01), chr(rand($82, $FA)))
            Next
            setfontex(XD00026ZX2\Field0[$0A])
            rowtext(local10, (Int ((Float TDD0Z6BXB6\Field6) - (200.0 * menuscale))), (Int ((Float TDD0Z6BXB6\Field9) + (250.0 * menuscale))), (Int (400.0 * menuscale)), (Int (300.0 * menuscale)), $01, 1.0)
        Else
            color($FF, $FF, $FF, $FF)
            setfontex(XD00026ZX2\Field0[$01])
            textex(TDD0Z6BXB6\Field6, (Int ((Float TDD0Z6BXB6\Field9) - (450.0 * menuscale))), loadingscreentitle, $01, $01)
            setfontex(XD00026ZX2\Field0[$0A])
            rowtext(TX240XXB6Z6(D8XX4X0D0(descriptions, descriptionindex)), (Int ((Float TDD0Z6BXB6\Field6) - (200.0 * menuscale))), (Int ((Float TDD0Z6BXB6\Field9) + (200.0 * menuscale))), (Int (400.0 * menuscale)), (Int (300.0 * menuscale)), $01, 1.0)
        EndIf
        setfontex(XD00026ZX2\Field0[$00])
        If ((Int floor(arg0)) <> $64) Then
            color($FF, $FF, $FF, $FF)
            If (99.5 = arg0) Then
                textex(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (35.0 * menuscale))), X4Z088FBZ0, $01, $01)
            Else
                textex(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (35.0 * menuscale))), format(getlocalstring("loading", "assets"), X4Z088FBZ0, "%s"), $01, $01)
            EndIf
            resetinput(10.0)
        Else
            If (local6 <> 0) Then
                local10 = getlocalstring("menu", "wakeup")
            Else
                If (local3 <> 0) Then
                    playsound_strict(loadtempsound("SFX\Horror\Horror8.ogg"), $00, $00)
                EndIf
                local10 = getlocalstring("menu", "anykey")
            EndIf
            renderloadingtext(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (35.0 * menuscale))), local10, $01, $01)
        EndIf
        flip($00)
        local3 = $00
        If ((Int floor(arg0)) <> $64) Then
            Exit
        Else
            delay($10)
        EndIf
        If ((((initializeintromovie And local6) Lor (getkey() <> $00)) Lor mousehit($01)) <> 0) Then
            X64Z0X8D64()
            Exit
        EndIf
    Forever
    If ((((initializeintromovie And local6) And opt\Field3) And ((Int floor(arg0)) = $64)) <> 0) Then
        stopstream_strict(musicchn)
        musicchn = $00
        playmovie("startup_Intro")
    EndIf
    seedrnd(local0)
    catcherrors((((("Uncaught: RenderLoading(" + (Str (Int floor(arg0)))) + ", ") + X4Z088FBZ0) + ")"))
    Return $00
End Function
