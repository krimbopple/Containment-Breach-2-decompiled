Function rendermainmenu%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10$
    Local local11$
    Local local12$
    Local local13%
    Local local17.T402X2Z846
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local22#
    Local local30#
    Local local36%
    catcherrors("RenderMainMenu()")
    XF6BBD02B6()
    rendergamma()
    imageheight(mma\Field3)
    drawimage(mma\Field3, (Int (40.0 * menuscale)), $00, $00)
    XF6284DFZD()
    setfontex(XD00026ZX2\Field0[$0A])
    If (onpalette = $00) Then
        showpointer()
    Else
        hidepointer()
    EndIf
    If (T42DZ064FB\Field7[$01] > T42DZ064FB\Field12[$01]) Then
        color($32, $32, $32, $FF)
        textex((T42DZ064FB\Field1 + rand($FFFFFFFB, $05)), (T42DZ064FB\Field4 + rand($FFFFFFFB, $05)), T42DZ064FB\Field10, $01, $00)
        If (0.0 > T42DZ064FB\Field12[$01]) Then
            T42DZ064FB\Field12[$01] = rnd(700.0, 800.0)
            T42DZ064FB\Field7[$01] = rnd(10.0, 35.0)
            T42DZ064FB\Field1 = (Int ((Float rand($2BC, $3E8)) * menuscale))
            T42DZ064FB\Field4 = (Int ((Float rand($64, $258)) * menuscale))
            Select rand($00, $17)
                Case $00,$02,$03
                    T42DZ064FB\Field10 = getlocalstring("menu", "dontblink")
                Case $04,$05
                    T42DZ064FB\Field10 = getlocalstring("menu", "scp")
                Case $06,$07,$08
                    T42DZ064FB\Field10 = getlocalstring("menu", "happyending")
                Case $09,$0A,$0B
                    T42DZ064FB\Field10 = getlocalstring("menu", "scream")
                Case $0C,$13
                    T42DZ064FB\Field10 = getlocalstring("menu", "nil")
                Case $0D
                    T42DZ064FB\Field10 = getlocalstring("menu", "menuno")
                Case $0E
                    T42DZ064FB\Field10 = getlocalstring("menu", "bwg")
                Case $0F
                    T42DZ064FB\Field10 = getlocalstring("menu", "173care")
                Case $10
                    T42DZ064FB\Field10 = getlocalstring("menu", "9341")
                Case $11
                    T42DZ064FB\Field10 = getlocalstring("menu", "079doors")
                Case $12
                    T42DZ064FB\Field10 = getlocalstring("menu", "???")
                Case $14
                    T42DZ064FB\Field10 = getlocalstring("menu", "079king")
                Case $15
                    T42DZ064FB\Field10 = getlocalstring("menu", "spiral")
                Case $16
                    T42DZ064FB\Field10 = getlocalstring("menu", "damage")
                Case $17
                    T42DZ064FB\Field10 = getlocalstring("menu", "howl")
            End Select
        EndIf
    EndIf
    setfontex(XD00026ZX2\Field0[$01])
    imagewidth(mma\Field2)
    drawblock(mma\Field2, (Int (((Float opt\Field46) - (20.0 * menuscale)) - (Float imageheight(mma\Field2)))), $00, $00)
    If (T42DZ064FB\Field0 <> $00) Then
        local0 = (Int (80.0 * menuscale))
        local1 = (Int (286.0 * menuscale))
        local2 = (Int (400.0 * menuscale))
        local3 = (Int (70.0 * menuscale))
        Select T42DZ064FB\Field0
            Case $01
                local2 = (Int (900.0 * menuscale))
                local10 = getlocalstring("mpmenu", "serverlist")
            Case $04
                local10 = getlocalstring("menu", "new")
            Case $02
                local10 = getlocalstring("mpmenu", "hostserver")
            Case $03
                local10 = getlocalstring("mpmenu", "customization")
            Case $05
                local10 = getlocalstring("menu", "load")
            Case $06
                local10 = getlocalstring("menu", "loadmap")
            Case $07
                local10 = getlocalstring("menu", "options")
            Case $08
                local10 = getlocalstring("options", "grap")
            Case $09
                local10 = getlocalstring("options", "audio")
            Case $0A
                local10 = getlocalstring("options", "ctrl")
            Case $0B
                local10 = getlocalstring("options", "avc")
            Case $0C
                local10 = getlocalstring("mpmenu", "opt")
        End Select
        renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[$01])
        textex(((local2 Sar $01) + local0), ((local3 Sar $01) + local1), local10, $01, $01)
        local1 = (Int ((20.0 * menuscale) + (Float (local1 + local3))))
        local2 = (Int (580.0 * menuscale))
        If (T42DZ064FB\Field0 < $08) Then
            Select T42DZ064FB\Field0
                Case $01
                    local3 = (Int (415.0 * menuscale))
                    local2 = (Int (1080.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((Float local1) - (4.0 * menuscale)))
                    For local17 = Each T402X2Z846
                        If (local17\Field10 = TXFD22D0402\Field3) Then
                            If (local17\Field13 <> Null) Then
                                T8BX6B882(local17\Field13)
                            EndIf
                        EndIf
                    Next
                    local18 = (Float local0)
                    local18 = (((Float local2) * 0.0215) + local18)
                    local18 = (((Float local2) * 0.5457) + local18)
                    local18 = (((Float local2) * 0.18) + local18)
                    local18 = (((Float local2) * 0.13) + local18)
                    local18 = (((Float local2) * 0.1013) + local18)
                    renderframe((Int (local18 - (8.0 * menuscale))), (Int (((25.0 * menuscale) + (Float local1)) - (4.0 * menuscale))), (Int (((Float local2) * 0.0215) + (8.0 * menuscale))), local3, $00, $00, $00, $01)
                    color($64, $64, $64, $FF)
                    local19 = ((30.0 * menuscale) - (4.0 * menuscale))
                    local21 = ((Float local3) - (73.0 * menuscale))
                    local22 = 1.0
                    For local5 = $00 To $3E7 Step $01
                        local20 = (local20 + local19)
                        If (TXX0F66ZBZF[local5] = Null) Then
                            Exit
                        EndIf
                    Next
                    local22 = min((local21 / local20), 1.0)
                    rect((Int ((Float (Int (local18 - (8.0 * menuscale)))) + (1.0 * menuscale))), (Int ((((50.0 * menuscale) + (Float local1)) + (TXFD22D0402\Field6 * local22)) - (6.0 * menuscale))), eax_014F, (Int (((local21 * local22) + local19) - (8.0 * menuscale))), eax_0013)
                    setfontex(XD00026ZX2\Field0[$00])
                Case $02
                    local3 = (Int (405.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    setfontex(XD00026ZX2\Field0[$00])
                    color($FF, $FF, $FF, $FF)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((25.0 * menuscale) + (Float local1))), format(getlocalstring("mpmenu", "new.hostname"), "", "%s"), $00, $00)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((65.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.seed2"), "", "%s"), $00, $00)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((100.0 * menuscale) + (Float local1))), getlocalstring("mpmenu", "new.console"), $00, $00)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((185.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.diff"), $00, $00)
                    For local5 = $00 To $04 Step $01
                        color(difficulties[local5]\Field9, difficulties[local5]\Field5, difficulties[local5]\Field3, $FF)
                        textex((Int ((50.0 * menuscale) + (Float local0))), (Int (((Float (($1E * local5) + $E1)) * menuscale) + (Float local1))), difficulties[local5]\Field7, $00, $00)
                    Next
                    color($FF, $FF, $FF, $FF)
                    renderframe((Int ((150.0 * menuscale) + (Float local0))), (Int ((210.0 * menuscale) + (Float local1))), (Int (410.0 * menuscale)), (Int (160.0 * menuscale)), $00, $00, $00, $01)
                    If (selecteddifficulty\Field0 <> 0) Then
                        Select selecteddifficulty\Field1
                            Case $00
                                local10 = getlocalstring("mpmenu", "new.respawnany")
                            Case $01
                                local10 = getlocalstring("mpmenu", "new.respawnscreen")
                            Case $02
                                local10 = getlocalstring("mpmenu", "new.respawnstart")
                            Case $03
                                local10 = getlocalstring("mpmenu", "new.respawnno")
                        End Select
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((226.0 * menuscale) + (Float local1))), (getlocalstring("mpmenu", "new.respawntype") + local10), $00, $00)
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((255.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.dangernpc"), $00, $00)
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((286.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.invslots"), (Str selecteddifficulty\Field4), "%s"), $00, $00)
                        Select selecteddifficulty\Field8
                            Case $00
                                local10 = getlocalstring("menu", "new.easy")
                            Case $01
                                local10 = getlocalstring("menu", "new.normal")
                            Case $02
                                local10 = getlocalstring("menu", "new.hard")
                            Case $03
                                local10 = getlocalstring("menu", "new.extreme")
                        End Select
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((320.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.factors"), local10, "%s"), $00, $00)
                        Select selecteddifficulty\Field10
                            Case $00
                                local10 = getlocalstring("mpmenu", "new.keepitems")
                            Case $01
                                local10 = getlocalstring("mpmenu", "new.dropitems")
                            Case $02
                                local10 = getlocalstring("mpmenu", "new.loseitems")
                        End Select
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((350.0 * menuscale) + (Float local1))), format(getlocalstring("mpmenu", "new.invtype"), local10, "%s"), $00, $00)
                    Else
                        rowtext(selecteddifficulty\Field11, (Int ((160.0 * menuscale) + (Float local0))), (Int ((220.0 * menuscale) + (Float local1))), (Int (390.0 * menuscale)), (Int (140.0 * menuscale)), $00, 1.0)
                        renderframe((Int ((590.0 * menuscale) + (Float local0))), (Int ((90.0 * menuscale) + (Float local1))), (Int (350.0 * menuscale)), (Int (106.0 * menuscale)), $00, $00, $00, $01)
                        Select selecteddifficulty\Field1
                            Case $00
                                local10 = getlocalstring("mpmenu", "new.respawnany")
                            Case $01
                                local10 = getlocalstring("mpmenu", "new.respawnscreen")
                            Case $02
                                local10 = getlocalstring("mpmenu", "new.respawnstart")
                            Case $03
                                local10 = getlocalstring("mpmenu", "new.respawnno")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((98.0 * menuscale) + (Float local1))), (getlocalstring("mpmenu", "new.respawntype") + local10), $00, $00)
                        Select selecteddifficulty\Field2
                            Case $00
                                local10 = getlocalstring("menu", "no")
                            Case $01
                                local10 = getlocalstring("menu", "yes")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((114.0 * menuscale) + (Float local1))), ((getlocalstring("menu", "new.dangernpc") + ": ") + local10), $00, $00)
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((130.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.invslots"), (Str selecteddifficulty\Field4), "%s"), $00, $00)
                        Select selecteddifficulty\Field8
                            Case $00
                                local10 = getlocalstring("menu", "new.easy")
                            Case $01
                                local10 = getlocalstring("menu", "new.normal")
                            Case $02
                                local10 = getlocalstring("menu", "new.hard")
                            Case $03
                                local10 = getlocalstring("menu", "new.extreme")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((146.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.factors"), local10, "%s"), $00, $00)
                        Select selecteddifficulty\Field10
                            Case $00
                                local10 = getlocalstring("mpmenu", "new.keepitems")
                            Case $01
                                local10 = getlocalstring("mpmenu", "new.dropitems")
                            Case $02
                                local10 = getlocalstring("mpmenu", "new.loseitems")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((162.0 * menuscale) + (Float local1))), format(getlocalstring("mpmenu", "new.invtype"), local10, "%s"), $00, $00)
                        If (selecteddifficulty\Field7 = difficulties[$03]\Field7) Then
                            textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((178.0 * menuscale) + (Float local1))), getlocalstring("menu", "nohud"), $00, $00)
                        EndIf
                    EndIf
                    setfontex(XD00026ZX2\Field0[$01])
                Case $03
                    local3 = (Int (405.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    color($FF, $FF, $FF, $FF)
                    rect((Int ((20.0 * menuscale) + (Float local0))), local1, (Int (230.0 * menuscale)), (Int (320.0 * menuscale)), $00)
                    T8D04F6BD2((Int (((20.0 * menuscale) + (Float local0)) + 1.0)), (local1 + $01), (Int ((230.0 * menuscale) - 2.0)), (Int ((320.0 * menuscale) - 2.0)))
                    local30 = (Float mousexspeed())
                    If ((mouseon((Int ((20.0 * menuscale) + (Float local0))), local1, (Int (230.0 * menuscale)), (Int (320.0 * menuscale))) And TDD0Z6BXB6\Field1) <> 0) Then
                        turnentity(T42DZ064FB\Field6\Field3, 0.0, (local30 * 0.5), 0.0, $00)
                    EndIf
                    T42DZ064FB\Field11 = clamp((T42DZ064FB\Field11 + ((Float mousezspeed()) * 0.1)), 0.0, 3.0)
                    setfontex(XD00026ZX2\Field0[$00])
                    textex((Int ((280.0 * menuscale) + (Float local0))), (Int ((15.0 * menuscale) + (Float local1))), getlocalstring("mpmenu", "customization.character"), $00, $00)
                Case $04
                    local3 = (Int (345.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    setfontex(XD00026ZX2\Field0[$00])
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((25.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.name"), $00, $00)
                    If (selectedcustommap = Null) Then
                        local10 = format(getlocalstring("menu", "new.seed2"), "", "%s")
                    Else
                        local10 = format(getlocalstring("menu", "new.map"), "", "%s")
                        renderframe((Int ((150.0 * menuscale) + (Float local0))), (Int ((55.0 * menuscale) + (Float local1))), (Int (200.0 * menuscale)), (Int (30.0 * menuscale)), (local0 Mod $100), (local1 Mod $100), $01, $01)
                        color($FF, $00, $00, $FF)
                        local12 = converttoutf8(selectedcustommap\Field0)
                        If (len(local12) > $0F) Then
                            local11 = (left(local12, $0E) + "..")
                        Else
                            local11 = local12
                        EndIf
                        textex((Int ((250.0 * menuscale) + (Float local0))), (Int ((70.0 * menuscale) + (Float local1))), local11, $01, $01)
                    EndIf
                    color($FF, $FF, $FF, $FF)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((65.0 * menuscale) + (Float local1))), local10, $00, $00)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((115.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.intro"), $00, $00)
                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((155.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.diff"), $00, $00)
                    For local5 = $00 To $04 Step $01
                        color(difficulties[local5]\Field9, difficulties[local5]\Field5, difficulties[local5]\Field3, $FF)
                        textex((Int ((50.0 * menuscale) + (Float local0))), (Int (((Float (($1E * local5) + $B9)) * menuscale) + (Float local1))), difficulties[local5]\Field7, $00, $00)
                    Next
                    color($FF, $FF, $FF, $FF)
                    renderframe((Int ((150.0 * menuscale) + (Float local0))), (Int ((170.0 * menuscale) + (Float local1))), (Int (410.0 * menuscale)), (Int (160.0 * menuscale)), $00, $00, $00, $01)
                    If (selecteddifficulty\Field0 <> 0) Then
                        Select selecteddifficulty\Field1
                            Case $00
                                local10 = getlocalstring("menu", "new.saveany")
                            Case $01
                                local10 = getlocalstring("menu", "new.savescreen")
                            Case $02
                                local10 = getlocalstring("menu", "new.savequit")
                            Case $03
                                local10 = getlocalstring("menu", "new.saveno")
                        End Select
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((186.0 * menuscale) + (Float local1))), (getlocalstring("menu", "new.savetype") + local10), $00, $00)
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((215.0 * menuscale) + (Float local1))), getlocalstring("menu", "new.dangernpc"), $00, $00)
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((246.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.invslots"), (Str selecteddifficulty\Field4), "%s"), $00, $00)
                        Select selecteddifficulty\Field8
                            Case $00
                                local10 = getlocalstring("menu", "new.easy")
                            Case $01
                                local10 = getlocalstring("menu", "new.normal")
                            Case $02
                                local10 = getlocalstring("menu", "new.hard")
                            Case $03
                                local10 = getlocalstring("menu", "new.extreme")
                        End Select
                        textex((Int ((200.0 * menuscale) + (Float local0))), (Int ((276.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.factors"), local10, "%s"), $00, $00)
                    Else
                        rowtext(selecteddifficulty\Field11, (Int ((160.0 * menuscale) + (Float local0))), (Int ((180.0 * menuscale) + (Float local1))), (Int (390.0 * menuscale)), (Int (140.0 * menuscale)), $00, 1.0)
                        renderframe((Int ((590.0 * menuscale) + (Float local0))), (Int ((50.0 * menuscale) + (Float local1))), (Int (350.0 * menuscale)), (Int (90.0 * menuscale)), $00, $00, $00, $01)
                        Select selecteddifficulty\Field1
                            Case $00
                                local10 = getlocalstring("menu", "new.saveany")
                            Case $01
                                local10 = getlocalstring("menu", "new.savescreen")
                            Case $02
                                local10 = getlocalstring("menu", "new.savequit")
                            Case $03
                                local10 = getlocalstring("menu", "new.saveno")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((58.0 * menuscale) + (Float local1))), (getlocalstring("menu", "new.savetype") + local10), $00, $00)
                        Select selecteddifficulty\Field2
                            Case $00
                                local10 = getlocalstring("menu", "no")
                            Case $01
                                local10 = getlocalstring("menu", "yes")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((74.0 * menuscale) + (Float local1))), ((getlocalstring("menu", "new.dangernpc") + ": ") + local10), $00, $00)
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((90.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.invslots"), (Str selecteddifficulty\Field4), "%s"), $00, $00)
                        Select selecteddifficulty\Field8
                            Case $00
                                local10 = getlocalstring("menu", "new.easy")
                            Case $01
                                local10 = getlocalstring("menu", "new.normal")
                            Case $02
                                local10 = getlocalstring("menu", "new.hard")
                            Case $03
                                local10 = getlocalstring("menu", "new.extreme")
                        End Select
                        textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((106.0 * menuscale) + (Float local1))), format(getlocalstring("menu", "new.factors"), local10, "%s"), $00, $00)
                        If (selecteddifficulty\Field7 = difficulties[$03]\Field7) Then
                            textex((Int ((600.0 * menuscale) + (Float local0))), (Int ((122.0 * menuscale) + (Float local1))), getlocalstring("menu", "nohud"), $00, $00)
                        EndIf
                    EndIf
                    setfontex(XD00026ZX2\Field0[$01])
                Case $05
                    local3 = (Int (430.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int (376.0 * menuscale))
                    local3 = (Int (296.0 * menuscale))
                    setfontex(XD00026ZX2\Field0[$01])
                    renderframe((Int ((60.0 * menuscale) + (Float local0))), (Int ((440.0 * menuscale) + (Float local1))), (Int ((Float local2) - (120.0 * menuscale))), (Int (50.0 * menuscale)), $00, $00, $00, $01)
                    textex(((local2 Sar $01) + local0), (Int ((465.0 * menuscale) + (Float local1))), format(format(getlocalstring("menu", "page"), (Str (Int max((Float (T42DZ064FB\Field3 + $01)), 1.0))), "{0}"), (Str (Int max((Float (Int ceil(((Float savedgamesamount) / 5.0)))), 1.0))), "{1}"), $01, $01)
                    setfontex(XD00026ZX2\Field0[$00])
                    If (savedgamesamount = $00) Then
                        rowtext(getlocalstring("menu", "save.nosaves"), (Int ((20.0 * menuscale) + (Float local0))), (Int ((20.0 * menuscale) + (Float local1))), (Int (540.0 * menuscale)), (Int (390.0 * menuscale)), $00, 1.0)
                    Else
                        local0 = (Int ((20.0 * menuscale) + (Float local0)))
                        local1 = (Int ((20.0 * menuscale) + (Float local1)))
                        currsave = (First save)
                        For local5 = $00 To ((T42DZ064FB\Field3 * $05) + $04) Step $01
                            If (local5 > $00) Then
                                currsave = (After currsave)
                            EndIf
                            If (currsave = Null) Then
                                Exit
                            EndIf
                            If (local5 >= (T42DZ064FB\Field3 * $05)) Then
                                renderframe(local0, local1, (Int (540.0 * menuscale)), (Int (70.0 * menuscale)), $00, $00, $00, $01)
                                local13 = ($FF - ((currsave\Field1 <> "2.1.5") * $FF))
                                color($FF, local13, local13, $FF)
                                local12 = currsave\Field2
                                If (len(local12) > $0A) Then
                                    local11 = (left(local12, $09) + "..")
                                Else
                                    local11 = local12
                                EndIf
                                textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((10.0 * menuscale) + (Float local1))), local11, $00, $00)
                                If (len(currsave\Field4) > $10) Then
                                    local11 = (left(currsave\Field4, $0F) + "..")
                                Else
                                    local11 = currsave\Field4
                                EndIf
                                textex((Int ((150.0 * menuscale) + (Float local0))), (Int ((10.0 * menuscale) + (Float local1))), local11, $00, $00)
                                textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((30.0 * menuscale) + (Float local1))), currsave\Field3, $00, $00)
                                textex((Int ((150.0 * menuscale) + (Float local0))), (Int ((30.0 * menuscale) + (Float local1))), currsave\Field5, $00, $00)
                                textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((50.0 * menuscale) + (Float local1))), ("v" + currsave\Field1), $00, $00)
                                If (currsave\Field1 <> "2.1.5") Then
                                    color($FF, $00, $00, $FF)
                                Else
                                    For local4 = $00 To $04 Step $01
                                        If (currsave\Field0 = difficulties[local4]\Field7) Then
                                            color(difficulties[local4]\Field9, difficulties[local4]\Field5, difficulties[local4]\Field3, $FF)
                                            Exit
                                        EndIf
                                    Next
                                EndIf
                                textex((Int ((150.0 * menuscale) + (Float local0))), (Int ((50.0 * menuscale) + (Float local1))), currsave\Field0, $00, $00)
                                If (currsave = (Last save)) Then
                                    Exit
                                EndIf
                                local1 = (Int ((80.0 * menuscale) + (Float local1)))
                            EndIf
                        Next
                        color($FF, $FF, $FF, $FF)
                        If (delsave <> Null) Then
                            local0 = (Int (739.0 * menuscale))
                            local1 = (Int (376.0 * menuscale))
                            renderframe(local0, local1, (Int (420.0 * menuscale)), (Int (200.0 * menuscale)), $00, $00, $00, $01)
                            rowtext(getlocalstring("menu", "save.delete?"), (Int ((20.0 * menuscale) + (Float local0))), (Int ((15.0 * menuscale) + (Float local1))), (Int (400.0 * menuscale)), (Int (200.0 * menuscale)), $00, 1.0)
                        EndIf
                    EndIf
                Case $06
                    local3 = (Int (430.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int (376.0 * menuscale))
                    local3 = (Int (350.0 * menuscale))
                    setfontex(XD00026ZX2\Field0[$01])
                    local6 = (Float (local0 + local2))
                    local7 = (Float local1)
                    local8 = (400.0 * menuscale)
                    local9 = (150.0 * menuscale)
                    renderframe((Int ((60.0 * menuscale) + (Float local0))), (Int ((440.0 * menuscale) + (Float local1))), (Int ((Float local2) - (120.0 * menuscale))), (Int (50.0 * menuscale)), $00, $00, $00, $01)
                    textex(((local2 Sar $01) + local0), (Int ((465.0 * menuscale) + (Float local1))), format(format(getlocalstring("menu", "page"), (Str (Int max((Float (T42DZ064FB\Field3 + $01)), 1.0))), "{0}"), (Str (Int max((Float (Int ceil(((Float custommapsamount) / 5.0)))), 1.0))), "{1}"), $01, $01)
                    setfontex(XD00026ZX2\Field0[$00])
                    If (custommapsamount = $00) Then
                        rowtext(getlocalstring("menu", "nomap"), (Int ((20.0 * menuscale) + (Float local0))), (Int ((20.0 * menuscale) + (Float local1))), (Int (540.0 * menuscale)), (Int (390.0 * menuscale)), $00, 1.0)
                    Else
                        local0 = (Int ((20.0 * menuscale) + (Float local0)))
                        local1 = (Int ((20.0 * menuscale) + (Float local1)))
                        currcustommap = (First custommaps)
                        For local5 = $00 To ((T42DZ064FB\Field3 * $05) + $04) Step $01
                            If (local5 > $00) Then
                                currcustommap = (After currcustommap)
                            EndIf
                            If (currcustommap = Null) Then
                                Exit
                            EndIf
                            If (local5 >= (T42DZ064FB\Field3 * $05)) Then
                                renderframe(local0, local1, (Int (540.0 * menuscale)), (Int (70.0 * menuscale)), $00, $00, $00, $01)
                                local12 = converttoutf8(currcustommap\Field0)
                                If (len(local12) > $14) Then
                                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((15.0 * menuscale) + (Float local1))), (left(local12, $13) + ".."), $00, $00)
                                Else
                                    textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((15.0 * menuscale) + (Float local1))), local12, $00, $00)
                                EndIf
                                textex((Int ((20.0 * menuscale) + (Float local0))), (Int ((45.0 * menuscale) + (Float local1))), converttoutf8(currcustommap\Field1), $00, $00)
                                If ((mouseon((Int ((280.0 * menuscale) + (Float local0))), (Int ((20.0 * menuscale) + (Float local1))), (Int (100.0 * menuscale)), (Int (30.0 * menuscale))) Lor mouseon((Int ((400.0 * menuscale) + (Float local0))), (Int ((20.0 * menuscale) + (Float local1))), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)))) <> 0) Then
                                    rendermapcreatortooltip((Int local6), (Int local7), (Int local8), (Int local9), currcustommap\Field0)
                                EndIf
                                If (currcustommap = (Last custommaps)) Then
                                    Exit
                                EndIf
                                local1 = (Int ((80.0 * menuscale) + (Float local1)))
                            EndIf
                        Next
                        If (delcustommap <> Null) Then
                            local0 = (Int (739.0 * menuscale))
                            local1 = (Int (376.0 * menuscale))
                            renderframe(local0, local1, (Int (420.0 * menuscale)), (Int (200.0 * menuscale)), $00, $00, $00, $01)
                            rowtext(getlocalstring("menu", "map.delete?"), (Int ((20.0 * menuscale) + (Float local0))), (Int ((15.0 * menuscale) + (Float local1))), (Int (400.0 * menuscale)), (Int (200.0 * menuscale)), $00, 1.0)
                        EndIf
                    EndIf
                Case $07
                    local3 = (Int (380.0 * menuscale))
                    renderframe(local0, local1, local2, local3, $00, $00, $00, $01)
            End Select
        Else
            local0 = (Int ((20.0 * menuscale) + (Float local0)))
            local6 = (((Float local0) - (20.0 * menuscale)) + (Float local2))
            local7 = (Float local1)
            local8 = (400.0 * menuscale)
            local9 = (150.0 * menuscale)
            local36 = (Int (30.0 * menuscale))
            Select T42DZ064FB\Field0
                Case $08
                    local3 = (Int (540.0 * menuscale))
                    renderframe((Int ((Float local0) - (20.0 * menuscale))), local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((25.0 * menuscale) + (Float local1)))
                    setfontex(XD00026ZX2\Field0[$00])
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "gamma"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $05, opt\Field50)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "renderscale"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $234)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2D, opt\Field77)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "fov"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $04)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $08, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, local1, getlocalstring("options", "particle"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $07, (Float opt\Field69))
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    resizeimage(mma\Field1, (Int ((Float local2) * 0.9)), imageheight(mma\Field1))
                    drawimage(mma\Field1, local0, $00, $00)
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, local1, getlocalstring("options", "lightingquality"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) Lor (onsliderid = $07)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $0B, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "reflectionsquality"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $30, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "renderdistance"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2C, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, local1, getlocalstring("options", "filter"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $09, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, local1, getlocalstring("options", "texquality"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2B, 0.0)
                    EndIf
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, local1, getlocalstring("options", "volumetriclights"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (local36 * $05), local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $26, 0.0)
                    EndIf
                    local1 = (Int ((37.0 * menuscale) + (Float local1)))
                    resizeimage(mma\Field1, (Int ((Float local2) * 0.9)), imageheight(mma\Field1))
                    drawimage(local0, local1, $00, $00)
                    local1 = (Int ((13.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "vsync"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $01, 0.0)
                    EndIf
                    textex((Int ((330.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "antialias"), $00, $00)
                    If ((mouseon((Int ((490.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $02, 0.0)
                    EndIf
                    local1 = (Int ((25.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "bloom"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $27, 0.0)
                    EndIf
                    textex((Int ((330.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "motionblur"), $00, $00)
                    If ((mouseon((Int ((490.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $28, 0.0)
                    EndIf
                    local1 = (Int ((25.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "ambientocclusion"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2A, 0.0)
                    EndIf
                    textex((Int ((330.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "vignette"), $00, $00)
                    If ((mouseon((Int ((490.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $22, 0.0)
                    EndIf
                    local1 = (Int ((25.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "hdrrender"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2F, 0.0)
                    EndIf
                    textex((Int ((330.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "parallaxocclusion"), $00, $00)
                    If ((mouseon((Int ((490.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $2E, 0.0)
                    EndIf
                    local1 = (Int ((25.0 * menuscale) + (Float local1)))
                Case $09
                    local3 = (Int ((Float (((((opt\Field81 > $00) * $28) + $118) + (opt\Field53 * $1E)) + ((opt\Field53 And opt\Field57) * $9B))) * menuscale))
                    renderframe((Int ((Float local0) - (20.0 * menuscale))), local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    setfontex(XD00026ZX2\Field0[$00])
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "mastervolume"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $0C, opt\Field5)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "musicvolume"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $0D, opt\Field45)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "soundvolume"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $03)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $0E, opt\Field13)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "voicevolume"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $04)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $0F, opt\Field59)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "autorelease"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int ((220.0 * menuscale) + local9)), $10, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "trackmode"), $00, $00)
                    Select opt\Field81
                        Case $00
                            local10 = getlocalstring("options", "track.disabled")
                        Case $01
                            local10 = getlocalstring("options", "track.repeat")
                        Case $02
                            local10 = getlocalstring("options", "track.random")
                    End Select
                    textex((Int ((330.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), local10, $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $11, 0.0)
                    EndIf
                    If (opt\Field81 > $00) Then
                        If ((mouseon(local0, (Int ((30.0 * menuscale) + (Float local1))), (Int (210.0 * menuscale)), (Int (30.0 * menuscale))) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $12, 0.0)
                        EndIf
                        If (usertrackcheck > $00) Then
                            textex((Int ((240.0 * menuscale) + (Float local0))), (Int ((40.0 * menuscale) + (Float local1))), format(format(getlocalstring("options", "track.found"), (Str usertrackcheck2), "{0}"), (Str usertrackcheck), "{1}"), $00, $00)
                        EndIf
                        local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "subtitles"), $00, $00)
                    If (mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $13, 0.0)
                    EndIf
                    If (opt\Field53 <> 0) Then
                        local1 = (Int ((30.0 * menuscale) + (Float local1)))
                        textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "subtitles.color"), $00, $00)
                        local1 = (Int ((5.0 * menuscale) + (Float local1)))
                        If (mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) <> 0) Then
                            renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $14, 0.0)
                        EndIf
                        If (opt\Field57 <> 0) Then
                            local1 = (Int ((30.0 * menuscale) + (Float local1)))
                            If (mouseon((Int ((227.0 * menuscale) + (Float local0))), local1, (Int (147.0 * menuscale)), (Int (147.0 * menuscale))) <> 0) Then
                                renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $14, 0.0)
                            EndIf
                            local1 = (Int ((30.0 * menuscale) + (Float local1)))
                            textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "subtitles.color.red"), $00, $00)
                            If (mouseon((Int ((155.0 * menuscale) + (Float local0))), local1, (local36 Shl $01), local36) <> 0) Then
                                renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $14, 0.0)
                            EndIf
                            local1 = (Int ((30.0 * menuscale) + (Float local1)))
                            textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "subtitles.color.green"), $00, $00)
                            If (mouseon((Int ((155.0 * menuscale) + (Float local0))), local1, (local36 Shl $01), local36) <> 0) Then
                                renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $14, 0.0)
                            EndIf
                            local1 = (Int ((30.0 * menuscale) + (Float local1)))
                            textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "subtitles.color.blue"), $00, $00)
                            If (mouseon((Int ((155.0 * menuscale) + (Float local0))), local1, (local36 Shl $01), local36) <> 0) Then
                                renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $14, 0.0)
                            EndIf
                            color($14, $14, $14, $FF)
                            rect((Int ((Float local0) - (20.0 * menuscale))), eax_0903, local2, (Int (20.0 * menuscale)), esi_0306)
                            color((Int ((Float (opt\Field8 + $82)) / 2.0)), (Int ((Float (opt\Field52 + $82)) / 2.0)), (Int ((Float (opt\Field1 + $82)) / 2.0)), $FF)
                            textex(local0, (Int ((396.0 * menuscale) + (Float local3))), getlocalstring("options", "subtitles.example"), $00, $00)
                        EndIf
                    EndIf
                Case $0A
                    local3 = (Int (360.0 * menuscale))
                    renderframe((Int ((Float local0) - (20.0 * menuscale))), local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    setfontex(XD00026ZX2\Field0[$00])
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "mousesensitive"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $15, opt\Field65)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "mousesmooth"), $00, $00)
                    If (((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $02)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $16, opt\Field39)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "invertx"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $17, 0.0)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "inverty"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $18, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("menu", "controlconfig"), $00, $00)
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.forward"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.crouch"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.left"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.blink"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.backward"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.inv"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.right"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.save"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.sprint"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.screenshot"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.lean.left"), $00, $00)
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.lean.right"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex((Int ((260.0 * menuscale) + (Float local0))), (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "key.interact"), $00, $00)
                    If (opt\Field28 <> 0) Then
                        textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "key.console"), $00, $00)
                    EndIf
                    If (mouseon(local0, (Int ((Float local1) - ((Float ((opt\Field28 * $14) + $3C)) * menuscale))), (local2 - (local36 Shl $01)), (Int ((Float ((opt\Field28 * $14) + $78)) * menuscale))) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $19, 0.0)
                    EndIf
                Case $0B
                    local3 = (Int (460.0 * menuscale))
                    renderframe((Int ((Float local0) - (20.0 * menuscale))), local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    setfontex(XD00026ZX2\Field0[$00])
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "hud"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1A, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "console"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1B, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    If (opt\Field28 <> 0) Then
                        textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "error"), $00, $00)
                        If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                            renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1C, 0.0)
                        EndIf
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "achipop"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1D, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "save"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $20, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "fps"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1E, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "frame"), $00, $00)
                    If ((mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) And (onsliderid = $00)) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1F, (Float opt\Field67))
                    EndIf
                    If (0.0 < opt\Field29) Then
                        color($FF, $FF, $00, $FF)
                        textex(local0, (Int ((45.0 * menuscale) + (Float local1))), ((Str opt\Field67) + " FPS"), $00, $00)
                        If (((mouseon((Int ((130.0 * menuscale) + (Float local0))), ((local36 Shl $01) + local1), (Int ((Float local36) * 8.2)), local36) And (onsliderid = $00)) Lor (onsliderid = $01)) <> 0) Then
                            renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $1F, (Float opt\Field67))
                        EndIf
                        local1 = (Int ((50.0 * menuscale) + (Float local1)))
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    color($FF, $FF, $FF, $FF)
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "startvideo"), $00, $00)
                    If (mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $23, 0.0)
                    EndIf
                    local1 = (Int ((30.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("options", "launcher"), $00, $00)
                    If (mouseon((Int ((290.0 * menuscale) + (Float local0))), local1, local36, local36) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $24, 0.0)
                    EndIf
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    If (mouseon(local0, local1, (Int (195.0 * menuscale)), (Int (30.0 * menuscale))) <> 0) Then
                        renderoptionstooltip((Int local6), (Int local7), (Int local8), (Int local9), $25, 0.0)
                    EndIf
                Case $0C
                    local3 = (Int (455.0 * menuscale))
                    renderframe((Int ((Float local0) - (20.0 * menuscale))), local1, local2, local3, $00, $00, $00, $01)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    setfontex(XD00026ZX2\Field0[$00])
                    color($FF, $FF, $FF, $FF)
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "playername"), $00, $00)
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "selvoice"), $00, $00)
                    local1 = (Int ((40.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "voicevolume"), $00, $00)
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "autovoice"), $00, $00)
                    local1 = (Int ((35.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "showhud"), $00, $00)
                    local1 = (Int ((45.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("menu", "controlconfig"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "voice"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "voiceradio"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "chat"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "playerslist"), $00, $00)
                    local1 = (Int ((20.0 * menuscale) + (Float local1)))
                    textex(local0, (Int ((5.0 * menuscale) + (Float local1))), getlocalstring("mpoptions", "jumpkey"), $00, $00)
            End Select
        EndIf
    Else
        BDBF6B0XD()
    EndIf
    FDDB806Z8()
    rendermenubuttons()
    rendermenupalettes()
    rendermenuticks()
    rendermenuinputboxes()
    rendermenuslidebars()
    rendermenusliders()
    TXDZ0F2ZFXZ($0A, $00)
    If (opt\Field68 <> 0) Then
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[$0C])
        If (opt\Field49 <> 0) Then
            textex((Int (15.0 * menuscale)), (Int ((Float opt\Field46) - (50.0 * menuscale))), (((("v" + TDF640ZFFB) + " build ") + "44") + ". Based on UER"), $00, $00)
            textex((Int (15.0 * menuscale)), (Int ((Float opt\Field46) - (30.0 * menuscale))), ("FPS: " + (Str fps\Field1)), $00, $00)
        Else
            textex((Int (15.0 * menuscale)), (Int ((Float opt\Field46) - (30.0 * menuscale))), (((("v" + TDF640ZFFB) + " build ") + "44") + ". Based on UER"), $00, $00)
        EndIf
    EndIf
    rendercursor()
    setfontex(XD00026ZX2\Field0[$00])
    catcherrors("Uncaught: RenderMainMenu()")
    Return $00
End Function
