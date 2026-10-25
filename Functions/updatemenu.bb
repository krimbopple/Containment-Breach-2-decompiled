Function updatemenu%()
    Local local0%
    Local local1%
    Local local2.achievementmsg
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local18%
    Local local19%
    Local local20$
    Local local21%
    Local local22%
    Local local24%
    catcherrors("UpdateMenu()")
    If (menuopen <> 0) Then
        onpalette = $00
        invopen = $00
        local5 = imagewidth(X2Z260BF0Z\Field4[$00])
        local6 = imageheight(X2Z260BF0Z\Field4[$00])
        local7 = (TDD0Z6BXB6\Field6 - (local5 Sar $01))
        local8 = (TDD0Z6BXB6\Field9 - (local6 Sar $01))
        local7 = (Int ((132.0 * menuscale) + (Float local7)))
        local8 = (Int ((122.0 * menuscale) + (Float local8)))
        If (TDD0Z6BXB6\Field1 = $00) Then
            onsliderid = $00
        EndIf
        If ((((igm\Field2 <= $00) And (igm\Field0 > $00)) And (igm\Field1 <= $00)) <> 0) Then
            If (igm\Field0 = $01) Then
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("options", "grap"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    changeoptiontab($02, $00)
                EndIf
                If (updatemenubutton(local7, (Int ((75.0 * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("options", "audio"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    changeoptiontab($03, $00)
                EndIf
                If (updatemenubutton(local7, (Int ((150.0 * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("options", "ctrl"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    changeoptiontab($04, $00)
                EndIf
                If (updatemenubutton(local7, (Int ((225.0 * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("options", "avc"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    changeoptiontab($05, $00)
                EndIf
                If (updatemenubutton(local7, (Int ((300.0 * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("mpmenu", "opt"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    changeoptiontab($06, $00)
                EndIf
                If (updatemenubutton((Int ((101.0 * menuscale) + (Float local7))), (Int ((455.0 * menuscale) + (Float local8))), (Int (230.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "back"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field2 = $00
                    igm\Field0 = $00
                    igm\Field1 = $00
                    resetinput(10.0)
                    shoulddeletegadgets = $01
                EndIf
            Else
                If (updatemenubutton((Int ((101.0 * menuscale) + (Float local7))), (Int ((455.0 * menuscale) + (Float local8))), (Int (230.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "back"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field2 = $00
                    igm\Field0 = $01
                    igm\Field1 = $00
                    resetinput(10.0)
                    saveoptionsini($00)
                    shoulddeletegadgets = $01
                EndIf
                local7 = (Int ((270.0 * menuscale) + (Float local7)))
                Select igm\Field0
                    Case $02
                        opt\Field50 = (updatemenuslidebar(local7, (Int ((5.0 * menuscale) + (Float local8))), (Int (100.0 * menuscale)), (opt\Field50 * 50.0), $01, $01) / 50.0)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field77 = (updatemenuslidebar(local7, (Int ((5.0 * menuscale) + (Float local8))), (Int (100.0 * menuscale)), (opt\Field77 * 50.0), $234, $01) / 50.0)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field64 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field64 * 2.0), $04, $01) / 2.0)
                        opt\Field15 = (opt\Field64 + 40.0)
                        camerazoomvalue = tan(((atan((tan((opt\Field15 / 2.0)) * (graphicwidthfloat / graphicheightfloat))) * 2.0) / 2.0))
                        camerazoom(camera, (min(((XZ0260X8X2\Field51 / 400.0) + 1.0), 1.1) / camerazoomvalue))
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field69 = updatemenuslider3(local7, local8, (Int (100.0 * menuscale)), opt\Field69, $02, getlocalstring("options", "min"), getlocalstring("options", "red"), getlocalstring("options", "full"))
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field76 = GUESSEDupdatesplit(local7, local8, (Int (100.0 * menuscale)), ((((((((getlocalstring("options", "slider.verylow") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")) + "\n") + getlocalstring("options", "slider.ultra")), opt\Field76)
                        GUESSEDrenderresetrender(opt\Field76)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field44 = GUESSEDupdatesplit(local7, local8, (Int (100.0 * menuscale)), ((((getlocalstring("options", "slider.low") + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field44)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field71 = GUESSEDupdatesplit(local7, local8, (Int (100.0 * menuscale)), ((((((getlocalstring("options", "disabled") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field71)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field79 = GUESSEDupdatesplit(local7, local8, (Int (100.0 * menuscale)), (getlocalstring("options", "tri") + "\n2X\n4X\n8X\n16X"), opt\Field79)
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
                        textureanisotropic(opt\Field60)
                        local7 = (Int ((Float local7) - (90.0 * menuscale)))
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field16 = updatemenutick(local7, local8, opt\Field16, $00)
                        opt\Field47 = updatemenutick((Int ((197.0 * menuscale) + (Float local7))), local8, opt\Field47, $00)
                        If (opt\Field47 = $00) Then
                            GUESSEDloadreload((GUESSEDupdatemenu() Or $100))
                        Else
                            GUESSEDloadreload((GUESSEDupdatemenu() And (GUESSEDupdatemenu() Xor $100)))
                        EndIf
                        local8 = (Int ((25.0 * menuscale) + (Float local8)))
                        opt\Field63 = updatemenutick(local7, local8, opt\Field63, $00)
                        opt\Field17 = updatemenutick((Int ((197.0 * menuscale) + (Float local7))), local8, opt\Field17, $00)
                        GUESSEDcreateentity_5(-1.0, -1.0, opt\Field17)
                        local8 = (Int ((25.0 * menuscale) + (Float local8)))
                        opt\Field10 = updatemenutick((Int ((197.0 * menuscale) + (Float local7))), local8, opt\Field10, $00)
                        opt\Field7 = updatemenutick(local7, local8, opt\Field7, $00)
                        local8 = (Int ((25.0 * menuscale) + (Float local8)))
                        opt\Field70 = updatemenutick(local7, local8, opt\Field70, $00)
                        opt\Field23 = updatemenutick((Int ((197.0 * menuscale) + (Float local7))), local8, opt\Field23, $00)
                        local8 = (Int ((25.0 * menuscale) + (Float local8)))
                    Case $03
                        If (XZ0260X8X2\Field61 = $00) Then
                            opt\Field5 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field2 * 100.0), $01, $01) / 100.0)
                            opt\Field2 = opt\Field5
                        Else
                            updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field2 * 100.0), $01, $01)
                        EndIf
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field45 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field45 * 100.0), $02, $01) / 100.0)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field13 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field13 * 100.0), $03, $01) / 100.0)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field59 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field59 * 100.0), $04, $01) / 100.0)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field73 = updatemenutick(local7, local8, opt\Field73, $01)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        local12 = opt\Field81
                        If (updatemenubutton(local7, local8, (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            If (opt\Field81 < $02) Then
                                opt\Field81 = (opt\Field81 + $01)
                            Else
                                opt\Field81 = $00
                            EndIf
                        EndIf
                        If (opt\Field81 > $00) Then
                            updatemenubutton((Int ((Float local7) - (270.0 * menuscale))), (Int ((30.0 * menuscale) + (Float local8))), (Int (210.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("options", "scantracks"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                            local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        EndIf
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        local13 = opt\Field53
                        local14 = opt\Field57
                        opt\Field53 = updatemenutick(local7, local8, opt\Field53, $00)
                        If (local13 <> opt\Field53) Then
                            If (opt\Field53 <> 0) Then
                                clearsubtitles()
                            EndIf
                        EndIf
                        If (opt\Field53 <> 0) Then
                            local8 = (Int ((30.0 * menuscale) + (Float local8)))
                            opt\Field57 = updatemenutick(local7, local8, opt\Field57, $00)
                        EndIf
                        If ((opt\Field53 And opt\Field57) <> 0) Then
                            local8 = (Int ((35.0 * menuscale) + (Float local8)))
                            updatemenupalette((Int ((Float local7) - (43.0 * menuscale))), (Int ((5.0 * menuscale) + (Float local8))))
                            local8 = (Int ((30.0 * menuscale) + (Float local8)))
                            opt\Field8 = (Int min((Float updatemenuinputbox((Int ((Float local7) - (115.0 * menuscale))), local8, (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field8), $00, $10, $03, 1.0, $00, $00, $00)), 255.0))
                            local8 = (Int ((30.0 * menuscale) + (Float local8)))
                            opt\Field52 = (Int min((Float updatemenuinputbox((Int ((Float local7) - (115.0 * menuscale))), local8, (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field52), $00, $11, $03, 1.0, $00, $00, $00)), 255.0))
                            local8 = (Int ((30.0 * menuscale) + (Float local8)))
                            opt\Field1 = (Int min((Float updatemenuinputbox((Int ((Float local7) - (115.0 * menuscale))), local8, (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field1), $00, $12, $03, 1.0, $00, $00, $00)), 255.0))
                        EndIf
                        If (((local13 Lor local14) Lor (local12 <> $01)) <> 0) Then
                            shoulddeletegadgets = (((local13 <> opt\Field53) Lor (local14 <> opt\Field57)) Lor (local12 <> opt\Field81))
                        EndIf
                    Case $04
                        local15 = selectedinputbox
                        opt\Field65 = ((updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), ((opt\Field65 + 0.5) * 100.0), $01, $01) / 100.0) - 0.5)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field39 = (updatemenuslidebar(local7, local8, (Int (100.0 * menuscale)), (opt\Field39 * 50.0), $02, $01) / 50.0)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field0 = updatemenutick(local7, local8, opt\Field0, $00)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        opt\Field18 = updatemenutick(local7, local8, opt\Field18, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field5), 264.0))], $00, $03, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field7), 264.0))], $00, $04, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field16), 264.0))], $00, $05, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field6), 264.0))], $00, $06, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field12), 264.0))], $00, $07, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field4), 264.0))], $00, $08, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field8), 264.0))], $00, $09, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field13), 264.0))], $00, $0A, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field15), 264.0))], $00, $0B, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field1), 264.0))], $00, $0D, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field19), 264.0))], $00, $0E, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field18), 264.0))], $00, $0F, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        If (opt\Field28 <> 0) Then
                            updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field11), 264.0))], $00, $0C, $00, 1.0, $00, $00, $01)
                            local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        EndIf
                        updatemenuinputbox(local7, local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field2), 264.0))], $00, $10, $00, 1.0, $00, $00, $01)
                        local16 = $00
                        If (((TDD0Z6BXB6\Field7 And (local15 = selectedinputbox)) And (selectedinputbox <> $00)) <> 0) Then
                            local16 = $100
                        EndIf
                        If (selectedinputbox <> $00) Then
                            For local4 = $00 To $107 Step $01
                                If (keyhit(local4) <> 0) Then
                                    local16 = local4
                                    Exit
                                EndIf
                            Next
                            If (local16 <> $00) Then
                                Select selectedinputbox
                                    Case $03
                                        key\Field5 = local16
                                    Case $04
                                        key\Field7 = local16
                                    Case $05
                                        key\Field16 = local16
                                    Case $06
                                        key\Field6 = local16
                                    Case $07
                                        key\Field12 = local16
                                    Case $08
                                        key\Field4 = local16
                                    Case $09
                                        key\Field8 = local16
                                    Case $0A
                                        key\Field13 = local16
                                    Case $0B
                                        key\Field15 = local16
                                    Case $0C
                                        key\Field11 = local16
                                    Case $0D
                                        key\Field1 = local16
                                    Case $0E
                                        key\Field19 = local16
                                    Case $0F
                                        key\Field18 = local16
                                    Case $10
                                        key\Field2 = local16
                                End Select
                                selectedinputbox = $00
                            EndIf
                        EndIf
                    Case $05
                        opt\Field68 = updatemenutick(local7, local8, opt\Field68, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        local18 = opt\Field28
                        opt\Field28 = updatemenutick(local7, local8, opt\Field28, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        If (opt\Field28 <> 0) Then
                            opt\Field62 = updatemenutick(local7, local8, opt\Field62, $00)
                        EndIf
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        opt\Field51 = updatemenutick(local7, local8, opt\Field51, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        opt\Field35 = updatemenutick(local7, local8, opt\Field35, (selecteddifficulty\Field1 <> $00))
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        opt\Field49 = updatemenutick(local7, local8, opt\Field49, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        local19 = (0.0 < opt\Field29)
                        If (updatemenutick(local7, local8, (0.0 < opt\Field29), $00) <> 0) Then
                            opt\Field29 = (updatemenuslidebar((Int ((Float local7) - (120.0 * menuscale))), (Int ((40.0 * menuscale) + (Float local8))), (Int (100.0 * menuscale)), (opt\Field29 * 99.0), $01, $01) / 99.0)
                            opt\Field29 = max(opt\Field29, 0.01)
                            opt\Field67 = (Int ((opt\Field29 * 100.0) + 19.0))
                            local8 = (Int ((80.0 * menuscale) + (Float local8)))
                        Else
                            opt\Field29 = 0.0
                            opt\Field67 = $00
                            local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        EndIf
                        If ((local19 Lor local18) <> 0) Then
                            shoulddeletegadgets = (((Float local19) <> opt\Field29) Lor (local18 <> opt\Field28))
                        EndIf
                        opt\Field11 = updatemenutick(local7, local8, opt\Field11, $00)
                        local8 = (Int ((30.0 * menuscale) + (Float local8)))
                        opt\Field40 = updatemenutick(local7, local8, opt\Field40, $00)
                        local8 = (Int ((40.0 * menuscale) + (Float local8)))
                        updatemenubutton((Int ((Float local7) - (270.0 * menuscale))), local8, (Int (195.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("options", "reset"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                    Case $06
                        local15 = selectedinputbox
                        If (((opt\Field24 = "") And (GUESSEDcreatebank_3() > $00)) <> 0) Then
                            opt\Field24 = GUESSEDupdatemainmenu($00)
                        EndIf
                        If (opt\Field24 = "") Then
                            updatemenubutton((Int ((Float local7) - (130.0 * menuscale))), local8, (Int (300.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpoptions", "nullvoice"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        Else
                            local20 = opt\Field24
                            If (len(local20) > $1C) Then
                                local20 = left(opt\Field24, $1C)
                                local20 = (local20 + "...")
                            EndIf
                            If (updatemenubutton((Int ((Float local7) - (130.0 * menuscale))), local8, (Int (300.0 * menuscale)), (Int (30.0 * menuscale)), local20, $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                local21 = GUESSEDcreatebank_3()
                                If (local21 > $00) Then
                                    local22 = $00
                                    For local4 = $00 To (local21 - $01) Step $01
                                        If (GUESSEDupdatemainmenu(local4) = opt\Field24) Then
                                            local22 = local4
                                            Exit
                                        EndIf
                                    Next
                                    local22 = (local22 + $01)
                                    If (local22 >= local21) Then
                                        local22 = $00
                                    EndIf
                                    opt\Field24 = GUESSEDupdatemainmenu(local22)
                                    GUESSEDsetrecord()
                                EndIf
                            EndIf
                        EndIf
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field41 = (updatemenuslidebar((Int ((Float local7) - (80.0 * menuscale))), local8, (Int (150.0 * menuscale)), (opt\Field41 * 100.0), $01, $01) / 100.0)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field80 = updatemenutick((Int ((Float local7) - (80.0 * menuscale))), local8, opt\Field80, $00)
                        local8 = (Int ((35.0 * menuscale) + (Float local8)))
                        opt\Field74 = updatemenutick((Int ((Float local7) - (80.0 * menuscale))), local8, opt\Field74, $00)
                        local8 = (Int ((85.0 * menuscale) + (Float local8)))
                        updatemenuinputbox((Int ((Float local7) - (50.0 * menuscale))), local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field9), 264.0))], $00, $425, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox((Int ((Float local7) - (50.0 * menuscale))), local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field17), 264.0))], $00, $426, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox((Int ((Float local7) - (50.0 * menuscale))), local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field10), 264.0))], $00, $427, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox((Int ((Float local7) - (50.0 * menuscale))), local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field14), 264.0))], $00, $428, $00, 1.0, $00, $00, $01)
                        local8 = (Int ((20.0 * menuscale) + (Float local8)))
                        updatemenuinputbox((Int ((Float local7) - (50.0 * menuscale))), local8, (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field3), 264.0))], $00, $429, $00, 1.0, $00, $00, $01)
                        local16 = $00
                        If (((TDD0Z6BXB6\Field7 And (local15 = selectedinputbox)) And (selectedinputbox <> $00)) <> 0) Then
                            local16 = $100
                        EndIf
                        If (selectedinputbox <> $00) Then
                            For local4 = $00 To $107 Step $01
                                If (keyhit(local4) <> 0) Then
                                    local16 = local4
                                    Exit
                                EndIf
                            Next
                            If (local16 <> $00) Then
                                Select selectedinputbox
                                    Case $425
                                        key\Field9 = local16
                                    Case $426
                                        key\Field17 = local16
                                    Case $427
                                        key\Field10 = local16
                                    Case $428
                                        key\Field14 = local16
                                    Case $429
                                        key\Field3 = local16
                                End Select
                                selectedinputbox = $00
                            EndIf
                        EndIf
                End Select
            EndIf
        ElseIf ((((igm\Field2 <= $00) And (igm\Field0 <= $00)) And (igm\Field1 > $00)) <> 0) Then
            local24 = $55
            Select igm\Field1
                Case $01
                    If ((((selecteddifficulty\Field1 = $02) Lor (selecteddifficulty\Field1 = $00)) And (GUESSEDupdatexdb() = $00)) <> 0) Then
                        local24 = $A0
                        If (updatemenubutton(local7, (Int ((85.0 * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "savequit"), $01, $00, (cansave < $03), $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            XZ0260X8X2\Field16 = 0.0
                            savegame(currsave\Field2)
                            nullgame($01)
                            currsave = Null
                            resetinput(10.0)
                            Return $00
                        EndIf
                    EndIf
                    If (updatemenubutton(local7, (Int (((Float local24) * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "quit"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                        GUESSEDupdatetxxf()
                        nullgame($00)
                        currsave = Null
                        resetinput(10.0)
                        Return $00
                    EndIf
                Case $02
                    If (updatemenubutton(local7, (Int (((Float local24) * menuscale) + (Float local8))), (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("mpmenu", "stuck.terminate"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                        resumesounds()
                        resetinput(10.0)
                        kill($00, $01, $00, $01)
                        deletemenugadgets()
                        menuopen = $00
                    EndIf
            End Select
            If (updatemenubutton((Int ((101.0 * menuscale) + (Float local7))), (Int ((385.0 * menuscale) + (Float local8))), (Int (230.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "back"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                igm\Field2 = $00
                igm\Field0 = $00
                igm\Field1 = $00
                resetinput(10.0)
                shoulddeletegadgets = $01
            EndIf
        ElseIf ((((igm\Field2 > $00) And (igm\Field0 <= $00)) And (igm\Field1 <= $00)) <> 0) Then
            If (updatemenubutton((Int ((101.0 * menuscale) + (Float local7))), (Int ((345.0 * menuscale) + (Float local8))), (Int (230.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "back"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                igm\Field2 = $00
                igm\Field0 = $00
                igm\Field1 = $00
                resetinput(10.0)
                shoulddeletegadgets = $01
            EndIf
            If (igm\Field2 > $00) Then
                If (floor(((Float (_S2IMapSize(achievementsindex) - $01)) / 12.0)) >= (Float igm\Field2)) Then
                    If (updatemenubutton((Int ((341.0 * menuscale) + (Float local7))), (Int ((345.0 * menuscale) + (Float local8))), (Int (60.0 * menuscale)), (Int (60.0 * menuscale)), ">", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                        igm\Field2 = (igm\Field2 + $01)
                        shoulddeletegadgets = $01
                    EndIf
                Else
                    updatemenubutton((Int ((341.0 * menuscale) + (Float local7))), (Int ((345.0 * menuscale) + (Float local8))), (Int (60.0 * menuscale)), (Int (60.0 * menuscale)), ">", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                EndIf
                If (igm\Field2 > $01) Then
                    If (updatemenubutton((Int ((31.0 * menuscale) + (Float local7))), (Int ((345.0 * menuscale) + (Float local8))), (Int (60.0 * menuscale)), (Int (60.0 * menuscale)), "<", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                        igm\Field2 = (igm\Field2 - $01)
                        shoulddeletegadgets = $01
                    EndIf
                Else
                    updatemenubutton((Int ((31.0 * menuscale) + (Float local7))), (Int ((345.0 * menuscale) + (Float local8))), (Int (60.0 * menuscale)), (Int (60.0 * menuscale)), "<", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                EndIf
            EndIf
        Else
            local8 = (Int ((10.0 * menuscale) + (Float local8)))
            If ((((((Int XZ0260X8X2\Field48) Lor XZ0260X8X2\Field23) = $00) Lor (XZ0260X8X2\Field40 <> $FFFFFFFF)) Lor ((GUESSEDupdatexdb() <> $00) And ((Int XZ0260X8X2\Field48) And FD020X0BZ\Field5))) <> 0) Then
                local8 = (Int ((75.0 * menuscale) + (Float local8)))
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "resume"), $01, $01, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    resumesounds()
                    resetinput(10.0)
                    deletemenugadgets()
                    menuopen = $00
                    Return $00
                EndIf
                local8 = (Int ((75.0 * menuscale) + (Float local8)))
                If ((((selecteddifficulty\Field1 < $02) And (currsave <> Null)) And (len(currsave\Field2) > $00)) <> 0) Then
                    If (gamesaved <> 0) Then
                        If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "load"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            renderloading(0.0, getlocalstring("loading", "files"), $00, 0.025)
                            If (X2Z260BF0Z\Field1[$0C] <> $00) Then
                                freeentity(X2Z260BF0Z\Field1[$0C])
                                X2Z260BF0Z\Field1[$0C] = $00
                            EndIf
                            killsounds($01)
                            loadgamequick(currsave\Field2)
                            movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
                            hidepointer()
                            resetrender()
                            For local2 = Each achievementmsg
                                Delete local2
                            Next
                            renderloading(100.0, "", $00, 0.025)
                            XZ0260X8X2\Field16 = 0.0
                            updateworld(0.0, 0.0)
                            fps\Field3[$00] = 0.0
                            fps\Field6 = millisecs()
                            resetinput(10.0)
                            menuopen = $00
                            deletetextureentriesfromcache($00)
                            Return $00
                        EndIf
                    Else
                        updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "load"), $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                    EndIf
                    local8 = (Int ((75.0 * menuscale) + (Float local8)))
                EndIf
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "achievements"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field2 = $01
                    shoulddeletegadgets = $01
                EndIf
                local8 = (Int ((75.0 * menuscale) + (Float local8)))
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "options"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field0 = $01
                    shoulddeletegadgets = $01
                EndIf
                If (GUESSEDupdatexdb() <> $00) Then
                    local8 = (Int ((75.0 * menuscale) + (Float local8)))
                    If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("mpmenu", "stuck.stuck"), $01, $01, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                        igm\Field1 = $02
                        shoulddeletegadgets = $01
                    EndIf
                EndIf
                local8 = (Int ((75.0 * menuscale) + (Float local8)))
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "quit"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field1 = $01
                    shoulddeletegadgets = $01
                EndIf
            Else
                local8 = (Int ((75.0 * menuscale) + (Float local8)))
                If (selecteddifficulty\Field1 < $02) Then
                    If (gamesaved <> 0) Then
                        If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "load"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            renderloading(0.0, getlocalstring("loading", "files"), $00, 0.025)
                            If (X2Z260BF0Z\Field1[$0C] <> $00) Then
                                freeentity(X2Z260BF0Z\Field1[$0C])
                                X2Z260BF0Z\Field1[$0C] = $00
                            EndIf
                            killsounds($01)
                            loadgamequick(currsave\Field2)
                            movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
                            hidepointer()
                            resetrender()
                            For local2 = Each achievementmsg
                                Delete local2
                            Next
                            renderloading(100.0, "", $00, 0.025)
                            XZ0260X8X2\Field16 = 0.0
                            updateworld(0.0, 0.0)
                            fps\Field3[$00] = 0.0
                            fps\Field6 = millisecs()
                            resetinput(10.0)
                            menuopen = $00
                            deletetextureentriesfromcache($00)
                            Return $00
                        EndIf
                    Else
                        updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "load"), $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                    EndIf
                    local8 = (Int ((75.0 * menuscale) + (Float local8)))
                EndIf
                If (updatemenubutton(local7, local8, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "quitmenu"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    GUESSEDupdatetxxf()
                    nullgame($00)
                    currsave = Null
                    resetinput(10.0)
                    Return $00
                EndIf
            EndIf
        EndIf
    EndIf
    catcherrors("Uncaught: UpdateMenu()")
    Return $00
End Function
