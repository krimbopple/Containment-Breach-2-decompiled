Function rendermenu%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4$
    Local local5%
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12%
    Local local13%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20%
    catcherrors("RenderMenu()")
    If (((TFZF84XD6D() <> opt\Field37) And (TX6X48DXXDX = $00)) <> 0) Then
        menuopen = $01
        If (X4BX024DX0() = $00) Then
            pausesounds()
        EndIf
        delay($0A)
    EndIf
    If (menuopen <> 0) Then
        local0 = imagewidth(X2Z260BF0Z\Field4[$00])
        local1 = imageheight(X2Z260BF0Z\Field4[$00])
        local2 = (TDD0Z6BXB6\Field6 - (local0 Sar $01))
        local3 = (TDD0Z6BXB6\Field9 - (local1 Sar $01))
        If (onpalette <> 0) Then
            hidepointer()
        Else
            showpointer()
        EndIf
        drawblock(local2, local3, $00, $00)
        color($FF, $FF, $FF, $FF)
        If (igm\Field2 > $00) Then
            local4 = getlocalstring("menu", "achievements")
        ElseIf (igm\Field0 > $00) Then
            Select igm\Field0
                Case $01
                    local4 = getlocalstring("menu", "options")
                Case $02
                    local4 = getlocalstring("options", "grap")
                Case $03
                    local4 = getlocalstring("options", "audio")
                Case $04
                    local4 = getlocalstring("options", "ctrl")
                Case $05
                    local4 = getlocalstring("options", "avc")
                Case $06
                    local4 = getlocalstring("mpmenu", "opt")
            End Select
        ElseIf (igm\Field1 > $00) Then
            Select igm\Field1
                Case $01
                    local4 = getlocalstring("menu", "quit?")
                Case $02
                    local4 = getlocalstring("mpmenu", "stuck.terminate?")
            End Select
        ElseIf ((((((Int XZ0260X8X2\Field48) Lor XZ0260X8X2\Field23) = $00) Lor (XZ0260X8X2\Field40 <> $FFFFFFFF)) Lor ((X4BX024DX0() <> $00) And ((Int XZ0260X8X2\Field48) And FD020X0BZ\Field5))) <> 0) Then
            local4 = getlocalstring("menu", "paused")
        Else
            local4 = getlocalstring("menu", "died")
        EndIf
        setfontex(XD00026ZX2\Field0[$01])
        textex((Int ((47.0 * menuscale) + (Float ((local0 Sar $01) + local2)))), (Int ((48.0 * menuscale) + (Float local3))), local4, $01, $01)
        setfontex(XD00026ZX2\Field0[$00])
        local2 = (Int ((132.0 * menuscale) + (Float local2)))
        local3 = (Int ((122.0 * menuscale) + (Float local3)))
        If ((((igm\Field2 <= $00) And (igm\Field0 > $00)) And (igm\Field1 <= $00)) <> 0) Then
            If (igm\Field0 > $01) Then
                local8 = (Float (TDD0Z6BXB6\Field6 + (local0 Sar $01)))
                local9 = (Float local3)
                local10 = (400.0 * menuscale)
                local11 = (150.0 * menuscale)
                local12 = (Int (20.0 * menuscale))
                color($FF, $FF, $FF, $FF)
                Select igm\Field0
                    Case $02
                        color($FF, $FF, $FF, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "gamma"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $05, opt\Field50)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "renderscale"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $234)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $2D, opt\Field77)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "fov"), $00, $00)
                        color($FF, $FF, $00, $FF)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $04)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $08, 0.0)
                        EndIf
                        color($FF, $FF, $FF, $FF)
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, local3, getlocalstring("options", "particle"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), (Int ((Float local3) - (8.0 * menuscale))), (Int ((Float local12) * 5.7)), (Int (18.0 * menuscale))) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $07, (Float opt\Field69))
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, local3, getlocalstring("options", "lightingquality"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (local12 * $05), (Int (30.0 * menuscale))) And (onsliderid = $00)) Lor (onsliderid = $07)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $0B, 0.0)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "renderdistance"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (local12 * $05), (Int (30.0 * menuscale))) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $2C, 0.0)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, local3, getlocalstring("options", "volumetriclights"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (local12 * $05), (Int (30.0 * menuscale))) And (onsliderid = $00)) Lor (onsliderid = $07)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $26, 0.0)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, local3, getlocalstring("options", "filter"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (local12 * $05), (Int (30.0 * menuscale))) And (onsliderid = $00)) Lor (onsliderid = $05)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $09, 0.0)
                        EndIf
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "vsync"), $00, $00)
                        If ((mouseon((Int ((210.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $01, 0.0)
                        EndIf
                        textex((Int ((210.0 * menuscale) + (Float local2))), (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "parallaxocclusion"), $00, $00)
                        If ((mouseon((Int ((300.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $2E, 0.0)
                        EndIf
                        local3 = (Int ((25.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "bloom"), $00, $00)
                        If ((mouseon((Int ((210.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $27, 0.0)
                        EndIf
                        textex((Int ((210.0 * menuscale) + (Float local2))), (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "hdrrender"), $00, $00)
                        If ((mouseon((Int ((300.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $2F, 0.0)
                        EndIf
                        local3 = (Int ((25.0 * menuscale) + (Float local3)))
                        textex((Int ((210.0 * menuscale) + (Float local2))), (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "ambientocclusion"), $00, $00)
                        If ((mouseon((Int ((300.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $2A, 0.0)
                        EndIf
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "antialias"), $00, $00)
                        If ((mouseon((Int ((210.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $02, 0.0)
                        EndIf
                        local3 = (Int ((25.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "motionblur"), $00, $00)
                        If ((mouseon((Int ((210.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $28, 0.0)
                        EndIf
                        textex((Int ((210.0 * menuscale) + (Float local2))), (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "vignette"), $00, $00)
                        If ((mouseon((Int ((210.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $22, 0.0)
                        EndIf
                        local3 = (Int ((25.0 * menuscale) + (Float local3)))
                        rendermenubuttons()
                        rendermenuticks()
                        rendermenuslidebars()
                        rendermenusliders()
                    Case $03
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "mastervolume"), $00, $00)
                        If (((mouseon((Int ((250.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $0C, opt\Field5)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "musicvolume"), $00, $00)
                        If (((mouseon((Int ((250.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $0D, opt\Field45)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "soundvolume"), $00, $00)
                        If (((mouseon((Int ((250.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $03)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $0E, opt\Field13)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "voicevolume"), $00, $00)
                        If (((mouseon((Int ((250.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $04)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $0F, opt\Field59)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        color($64, $64, $64, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "autorelease"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int ((220.0 * menuscale) + local11)), $10, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        color($FF, $FF, $FF, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "trackmode"), $00, $00)
                        Select opt\Field81
                            Case $00
                                local4 = getlocalstring("options", "track.disabled")
                            Case $01
                                local4 = getlocalstring("options", "track.repeat")
                            Case $02
                                local4 = getlocalstring("options", "track.random")
                        End Select
                        textex((Int ((310.0 * menuscale) + (Float local2))), (Int ((5.0 * menuscale) + (Float local3))), local4, $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $11, 0.0)
                        EndIf
                        If (opt\Field81 > $00) Then
                            If ((mouseon(local2, (Int ((30.0 * menuscale) + (Float local3))), (Int (210.0 * menuscale)), (Int (30.0 * menuscale))) And (onsliderid = $00)) <> 0) Then
                                renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $12, 0.0)
                            EndIf
                            local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        color($FF, $FF, $FF, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles"), $00, $00)
                        If (mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $13, 0.0)
                        EndIf
                        If (opt\Field53 <> 0) Then
                            local3 = (Int ((30.0 * menuscale) + (Float local3)))
                            textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles.color"), $00, $00)
                            local3 = (Int ((5.0 * menuscale) + (Float local3)))
                            If (mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) <> 0) Then
                                renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $14, 0.0)
                            EndIf
                            If (opt\Field57 <> 0) Then
                                local3 = (Int ((30.0 * menuscale) + (Float local3)))
                                If (mouseon((Int ((227.0 * menuscale) + (Float local2))), local3, (Int (147.0 * menuscale)), (Int (147.0 * menuscale))) <> 0) Then
                                    renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $14, 0.0)
                                EndIf
                                local3 = (Int ((30.0 * menuscale) + (Float local3)))
                                textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles.color.red"), $00, $00)
                                If (mouseon((Int ((155.0 * menuscale) + (Float local2))), local3, (local12 Shl $01), local12) <> 0) Then
                                    renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $14, 0.0)
                                EndIf
                                local3 = (Int ((30.0 * menuscale) + (Float local3)))
                                textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles.color.green"), $00, $00)
                                If (mouseon((Int ((155.0 * menuscale) + (Float local2))), local3, (local12 Shl $01), local12) <> 0) Then
                                    renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $14, 0.0)
                                EndIf
                                local3 = (Int ((30.0 * menuscale) + (Float local3)))
                                textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles.color.blue"), $00, $00)
                                If (mouseon((Int ((155.0 * menuscale) + (Float local2))), local3, (local12 Shl $01), local12) <> 0) Then
                                    renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $14, 0.0)
                                EndIf
                            EndIf
                        EndIf
                        rendermenubuttons()
                        rendermenuticks()
                        rendermenuslidebars()
                        rendermenuinputboxes()
                        rendermenupalettes()
                    Case $04
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "mousesensitive"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $15, opt\Field65)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "mousesmooth"), $00, $00)
                        If (((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $16, opt\Field39)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "invertx"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $17, 0.0)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "inverty"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $18, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.forward"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.left"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.backward"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.right"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.sprint"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.crouch"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.blink"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.inv"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.save"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.screenshot"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.lean.left"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.lean.right"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        If (opt\Field28 <> 0) Then
                            textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "key.console"), $00, $00)
                            local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        EndIf
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "key.interact"), $00, $00)
                        If (mouseon(local2, (Int ((Float local3) - ((Float ((opt\Field28 * $14) + $8C)) * menuscale))), (Int (380.0 * menuscale)), (Int ((Float ((opt\Field28 * $14) + $F0)) * menuscale))) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $19, 0.0)
                        EndIf
                        rendermenubuttons()
                        rendermenuticks()
                        rendermenuinputboxes()
                        rendermenuslidebars()
                    Case $05
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "hud"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1A, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "console"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1B, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        If (opt\Field28 <> 0) Then
                            textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "error"), $00, $00)
                            If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                                renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1C, 0.0)
                            EndIf
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "achipop"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1D, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        local13 = ($FF - ((selecteddifficulty\Field1 <> $00) * $9B))
                        color(local13, local13, local13, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "save"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $20, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "fps"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1E, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "frame"), $00, $00)
                        If ((mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1F, (Float opt\Field67))
                        EndIf
                        If (0.0 < opt\Field29) Then
                            color($FF, $FF, $00, $FF)
                            textex(local2, (Int ((45.0 * menuscale) + (Float local3))), ((Str opt\Field67) + " FPS"), $00, $00)
                            If (((mouseon((Int ((150.0 * menuscale) + (Float local2))), (Int ((40.0 * menuscale) + (Float local3))), (Int ((Float local12) * 5.7)), local12) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                                renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $1F, (Float opt\Field67))
                            EndIf
                            rendermenusliders()
                            local3 = (Int ((50.0 * menuscale) + (Float local3)))
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        color($FF, $FF, $FF, $FF)
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "startvideo"), $00, $00)
                        If (mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $23, 0.0)
                        EndIf
                        local3 = (Int ((30.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("options", "launcher"), $00, $00)
                        If (mouseon((Int ((270.0 * menuscale) + (Float local2))), local3, local12, local12) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $24, 0.0)
                        EndIf
                        local3 = (Int ((40.0 * menuscale) + (Float local3)))
                        If (mouseon(local2, local3, (Int (195.0 * menuscale)), (Int (30.0 * menuscale))) <> 0) Then
                            renderoptionstooltip((Int local8), (Int local9), (Int local10), (Int local11), $25, 0.0)
                        EndIf
                        rendermenubuttons()
                        rendermenuticks()
                        rendermenuslidebars()
                        rendermenuinputboxes()
                    Case $06
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "selvoice"), $00, $00)
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "voicevolume"), $00, $00)
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "autovoice"), $00, $00)
                        local3 = (Int ((35.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "showhud"), $00, $00)
                        local3 = (Int ((60.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("menu", "controlconfig"), $00, $00)
                        local3 = (Int ((25.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "voice"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "voiceradio"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "chat"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "playerslist"), $00, $00)
                        local3 = (Int ((20.0 * menuscale) + (Float local3)))
                        textex(local2, (Int ((5.0 * menuscale) + (Float local3))), getlocalstring("mpoptions", "jumpkey"), $00, $00)
                        rendermenubuttons()
                        rendermenuticks()
                        rendermenuinputboxes()
                        rendermenuslidebars()
                End Select
            Else
                rendermenubuttons()
            EndIf
        ElseIf ((((igm\Field2 <= $00) And (igm\Field0 <= $00)) And (igm\Field1 > $00)) <> 0) Then
            rendermenubuttons()
        ElseIf ((((igm\Field2 > $00) And (igm\Field0 <= $00)) And (igm\Field1 <= $00)) <> 0) Then
            rendermenubuttons()
            If (igm\Field2 > $00) Then
                local16 = TD4644B68Z(TX0Z2Z4F86D(achievementsarray, "achievements"))
                local17 = (Int ((22.0 * menuscale) + (Float local2)))
                local18 = (Int (101.0 * menuscale))
                local19 = ((igm\Field2 - $01) * $0C)
                local20 = Y0DBXD6BBZ(achievementsindex)
                For local5 = $00 To $0B Step $01
                    If ((local5 + local19) < local20) Then
                        renderachvimg(local17, (Int (((Float ((local5 Sar $02) * $78)) * menuscale) + (Float local3))), local5, TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local16, (local5 + local19)), "id")))
                    Else
                        Exit
                    EndIf
                Next
                For local5 = $00 To $0B Step $01
                    If ((local5 + local19) < local20) Then
                        If (mouseon((((local5 Mod $04) * local18) + local17), (Int (((Float ((local5 Sar $02) * $78)) * menuscale) + (Float local3))), (Int (85.0 * menuscale)), (Int (85.0 * menuscale))) <> 0) Then
                            achievementtooltip(TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local16, (local5 + local19)), "id")))
                            Exit
                        EndIf
                    Else
                        Exit
                    EndIf
                Next
            EndIf
        Else
            rendermenubuttons()
            setfontex(XD00026ZX2\Field0[$00])
            textex(local2, local3, (getlocalstring("menu", "new.diff") + selecteddifficulty\Field7), $00, $00)
            If (((currsave = Null) Lor (currsave\Field2 = "")) <> 0) Then
                local4 = getlocalstring("menu", "dataredacted")
            Else
                local4 = converttoutf8(currsave\Field2)
            EndIf
            textex(local2, (Int ((20.0 * menuscale) + (Float local3))), format(getlocalstring("menu", "save"), local4, "%s"), $00, $00)
            If (selectedcustommap = Null) Then
                local4 = format(getlocalstring("menu", "new.seed2"), randomseed, "%s")
            ElseIf (len(converttoutf8(selectedcustommap\Field0)) > $0F) Then
                local4 = format(getlocalstring("menu", "new.map"), (left(converttoutf8(selectedcustommap\Field0), $0E) + ".."), "%s")
            Else
                local4 = format(getlocalstring("menu", "new.map"), converttoutf8(selectedcustommap\Field0), "%s")
            EndIf
            textex(local2, (Int ((40.0 * menuscale) + (Float local3))), local4, $00, $00)
            If ((((((Int XZ0260X8X2\Field48) Lor XZ0260X8X2\Field23) = $00) Lor (XZ0260X8X2\Field40 <> $FFFFFFFF)) Lor ((X4BX024DX0() <> $00) And ((Int XZ0260X8X2\Field48) And FD020X0BZ\Field5))) = $00) Then
                local3 = (Int ((175.0 * menuscale) + (Float local3)))
                If (selecteddifficulty\Field1 < $02) Then
                    local3 = (Int ((75.0 * menuscale) + (Float local3)))
                EndIf
                setfontex(XD00026ZX2\Field0[$00])
                rowtext(msg\Field8, local2, local3, (Int (430.0 * menuscale)), (Int (600.0 * menuscale)), $00, 1.0)
            EndIf
        EndIf
        rendercursor()
    EndIf
    setfontex(XD00026ZX2\Field0[$00])
    catcherrors("Uncaught: RenderMenu()")
    Return $00
End Function
