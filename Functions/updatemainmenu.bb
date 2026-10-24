Function updatemainmenu%()
    Local local0.save
    Local local1.custommaps
    Local local2.sound
    Local local3.difficulty
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8%
    Local local9%
    Local local10%
    Local local11$
    Local local12%
    Local local13%
    Local local14%
    Local local16%
    Local local17%
    Local local18#
    Local local19%
    Local local20#
    Local local21%
    Local local22#
    Local local23#
    Local local24#
    Local local25#
    Local local26%
    Local local27#
    Local local28#
    Local local29#
    Local local30.T402X2Z846
    Local local31%
    Local local32#
    Local local33.T402X2Z846
    Local local34%
    Local local35%
    Local local37$
    Local local38%
    Local local39%
    Local local40.XZ8B4B628
    Local local43%
    Local local44%
    Local local45$
    Local local46%
    Local local47%
    Local local48%
    Local local49%
    Local local50%
    Local local52%
    Local local53%
    Local local54$
    Local local55%
    Local local56%
    catcherrors("UpdateMainMenu()")
    While (0.0 < fps\Field7)
        fps\Field7 = (fps\Field7 - 1.147541)
        updatemouseinput()
        If (shoulddeletegadgets <> 0) Then
            deletemenugadgets()
        EndIf
        shoulddeletegadgets = $00
        ZFF8X2F22 = $00
        onpalette = $00
        updatemusic()
        If (opt\Field73 <> 0) Then
            autoreleasesounds()
        EndIf
        If (shouldplay = $14) Then
            endbreathsfx = loadsound_strict("SFX\Ending\MenuBreath.ogg")
            endbreathchn = playsound_strict(endbreathsfx, $01, $00)
            shouldplay = $42
        ElseIf (shouldplay = $42) Then
            If (ChannelPlaying(endbreathchn) = $00) Then
                freesound_strict(endbreathsfx)
                endbreathsfx = $00
                shouldplay = $0B
            EndIf
        Else
            shouldplay = $0B
        EndIf
        TBZ048822D()
        TX2Z2640FD()
        If (rand($12C, $01) = $01) Then
            T42DZ064FB\Field12[$00] = rnd(4000.0, 8000.0)
            T42DZ064FB\Field7[$00] = rnd(200.0, 500.0)
        EndIf
        T42DZ064FB\Field12[$01] = (T42DZ064FB\Field12[$01] - fps\Field3[$00])
        If (TDD0Z6BXB6\Field1 = $00) Then
            onsliderid = $00
        EndIf
        If (T42DZ064FB\Field2 <> T42DZ064FB\Field0) Then
            deletemenugadgets()
            T42DZ064FB\Field3 = $00
        EndIf
        T42DZ064FB\Field2 = T42DZ064FB\Field0
        local4 = (80.0 * menuscale)
        If (T42DZ064FB\Field0 = $00) Then
            T820Z2ZD2F()
            local5 = (286.0 * menuscale)
            local6 = (400.0 * menuscale)
            local7 = (70.0 * menuscale)
            randomseed = ""
            If ((updatemenubutton((Int local4), (Int local5), (Int local6), (Int local7), getlocalstring("mpmenu", "serverlist"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TX6X48DXXDX = $00)) <> 0) Then
                T42DZ064FB\Field0 = $01
                FBXDDD60Z()
                B24D0X6Z8(TXFD22D0402\Field3)
            EndIf
            local5 = ((100.0 * menuscale) + local5)
            If ((updatemenubutton((Int local4), (Int local5), (Int local6), (Int local7), getlocalstring("menu", "new"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TX6X48DXXDX = $00)) <> 0) Then
                If (opt\Field30 <> 0) Then
                    randomseed = "666"
                Else
                    local9 = rand($04, $08)
                    For local10 = $01 To local9 Step $01
                        If (rand($03, $01) = $01) Then
                            randomseed = (randomseed + (Str rand($00, $09)))
                        Else
                            randomseed = (randomseed + chr(rand($61, $7A)))
                        EndIf
                    Next
                EndIf
                loadsavedgames()
                currsave = (New save)
                loadcustommaps()
                currcustommap = (New custommaps)
                T42DZ064FB\Field0 = $04
            EndIf
            local5 = ((100.0 * menuscale) + local5)
            If ((updatemenubutton((Int local4), (Int local5), (Int local6), (Int local7), getlocalstring("menu", "load"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TX6X48DXXDX = $00)) <> 0) Then
                loadsavedgames()
                T42DZ064FB\Field0 = $05
            EndIf
            local5 = ((100.0 * menuscale) + local5)
            If ((updatemenubutton((Int local4), (Int local5), (Int local6), (Int local7), getlocalstring("menu", "options"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TX6X48DXXDX = $00)) <> 0) Then
                T42DZ064FB\Field0 = $07
            EndIf
            local5 = ((100.0 * menuscale) + local5)
            If ((updatemenubutton((Int local4), (Int local5), (Int local6), (Int local7), getlocalstring("menu", "quit"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TX6X48DXXDX = $00)) <> 0) Then
                stopstream_strict(musicchn)
                musicchn = $00
                end()
            EndIf
        Else
            local5 = (376.0 * menuscale)
            local6 = (580.0 * menuscale)
            If (T42DZ064FB\Field0 < $08) Then
                Select T42DZ064FB\Field0
                    Case $01
                        local7 = (415.0 * menuscale)
                        local6 = (1080.0 * menuscale)
                        local5 = (local5 - (4.0 * menuscale))
                        color($FF, $FF, $FF, $FF)
                        local16 = $00
                        local17 = $00
                        local18 = local4
                        local19 = $FFFFFFFF
                        If (updatemenubutton((Int local18), (Int local5), (Int (local6 / 4.0)), (Int (25.0 * menuscale)), format(getlocalstring("mpmenu", "list.official"), (Str TXZD4F0D244($00, $01)), "%s"), $00, $01, (TXFD22D0402\Field3 = $00), $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                            local19 = $00
                        EndIf
                        local18 = ((local6 / 4.0) + local18)
                        If (updatemenubutton((Int (local18 - (4.0 * menuscale))), (Int local5), (Int ((local6 / 4.0) + (4.0 * menuscale))), (Int (25.0 * menuscale)), format(getlocalstring("mpmenu", "list.internet"), (Str TXZD4F0D244($01, $00)), "%s"), $00, $01, (TXFD22D0402\Field3 = $01), $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                            local19 = $01
                        EndIf
                        local18 = ((local6 / 4.0) + local18)
                        If (updatemenubutton((Int (local18 - (4.0 * menuscale))), (Int local5), (Int ((local6 / 4.0) + (4.0 * menuscale))), (Int (25.0 * menuscale)), format(getlocalstring("mpmenu", "list.history"), (Str TXZD4F0D244($02, $00)), "%s"), $00, $01, (TXFD22D0402\Field3 = $02), $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                            local19 = $02
                        EndIf
                        local18 = ((local6 / 4.0) + local18)
                        If (updatemenubutton((Int (local18 - (4.0 * menuscale))), (Int local5), (Int ((local6 / 4.0) + (3.6 * menuscale))), (Int (25.0 * menuscale)), format(getlocalstring("mpmenu", "list.favourites"), (Str TXZD4F0D244($03, $00)), "%s"), $00, $01, (TXFD22D0402\Field3 = $03), $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                            local19 = $03
                        EndIf
                        If (local19 <> $FFFFFFFF) Then
                            TXFD22D0402\Field3 = local19
                            TBB628DX04()
                            B24D0X6Z8(TXFD22D0402\Field3)
                            local16 = $01
                            shoulddeletegadgets = $01
                        EndIf
                        local20 = local4
                        local16 = (local16 + mouseon((Int local20), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.027)), (Int (25.0 * menuscale))))
                        If (updatemenubutton((Int local20), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.027)), (Int (25.0 * menuscale)), "C", $09, $01, $00, $FF, $FF, $FF, $00, 1.0, $01, $01) <> 0) Then
                        EndIf
                        local20 = ((local6 * 0.027) + local20)
                        local16 = (local16 + mouseon((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.5402)), (Int (25.0 * menuscale))))
                        If (updatemenubutton((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int ((local6 * 0.5402) + (4.0 * menuscale))), (Int (25.0 * menuscale)), (getlocalstring("mpmenu", "servers") + TX24F2F08DF($00)), $00, $01, $00, $FF, $FF, $FF, $00, 0.05, $00, $00) <> 0) Then
                            T68BF20X0D(TXFD22D0402\Field3, $00)
                        EndIf
                        local20 = ((local6 * 0.5402) + local20)
                        local16 = (local16 + mouseon((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.18)), (Int (25.0 * menuscale))))
                        If (updatemenubutton((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int ((local6 * 0.18) + (4.0 * menuscale))), (Int (25.0 * menuscale)), (getlocalstring("mpmenu", "gamemode") + TX24F2F08DF($01)), $00, $01, $00, $FF, $FF, $FF, $00, 0.15, $00, $00) <> 0) Then
                            T68BF20X0D(TXFD22D0402\Field3, $01)
                        EndIf
                        local20 = ((local6 * 0.18) + local20)
                        local16 = (local16 + mouseon((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.13)), (Int (25.0 * menuscale))))
                        If (updatemenubutton((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int ((local6 * 0.13) + (4.0 * menuscale))), (Int (25.0 * menuscale)), (getlocalstring("mpmenu", "players") + TX24F2F08DF($02)), $00, $01, $00, $FF, $FF, $FF, $00, 0.15, $00, $00) <> 0) Then
                            T68BF20X0D(TXFD22D0402\Field3, $02)
                        EndIf
                        local20 = ((local6 * 0.13) + local20)
                        local16 = (local16 + mouseon((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int (local6 * 0.1013)), (Int (25.0 * menuscale))))
                        If (updatemenubutton((Int (local20 - (4.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int ((local6 * 0.1013) + (2.0 * menuscale))), (Int (25.0 * menuscale)), (getlocalstring("mpmenu", "ping") + TX24F2F08DF($03)), $00, $01, $00, $FF, $FF, $FF, $00, 0.15, $00, $00) <> 0) Then
                            T68BF20X0D(TXFD22D0402\Field3, $03)
                        EndIf
                        local20 = ((local6 * 0.1013) + local20)
                        local16 = (local16 + mouseon((Int local4), (Int (((local5 + local7) - (35.0 * menuscale)) + (6.0 * menuscale))), (Int local6), (Int (50.0 * menuscale))))
                        updatemenubutton((Int local4), (Int (((local5 + local7) - (41.0 * menuscale)) + (6.0 * menuscale))), (Int local6), (Int (60.0 * menuscale)), "", $00, $01, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
                        updatemenubutton((Int (local20 - (8.0 * menuscale))), (Int (((25.0 * menuscale) + local5) - (4.0 * menuscale))), (Int ((local6 * 0.0215) + (8.0 * menuscale))), (Int (25.0 * menuscale)), "E", $09, $01, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
                        If (updatemenubutton((Int ((15.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "refresh"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            If (TXFD22D0402\Field3 = $01) Then
                                FBXDDD60Z()
                            EndIf
                            T6D0XDFXZ4(TXFD22D0402\Field3, $14)
                            TBB628DX04()
                            B24D0X6Z8(TXFD22D0402\Field3)
                            local17 = $01
                            shoulddeletegadgets = $01
                        EndIf
                        local21 = TXFD22D0402\Field3
                        If (local21 <> $03) Then
                            If ((updatemenubutton((Int ((205.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "host"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                If (opt\Field30 <> 0) Then
                                    randomseed = "666"
                                Else
                                    local9 = rand($04, $08)
                                    For local10 = $01 To local9 Step $01
                                        If (rand($03, $01) = $01) Then
                                            randomseed = (randomseed + (Str rand($00, $09)))
                                        Else
                                            randomseed = (randomseed + chr(rand($61, $7A)))
                                        EndIf
                                    Next
                                EndIf
                                loadsavedgames()
                                currsave = (New save)
                                loadcustommaps()
                                currcustommap = (New custommaps)
                                T42DZ064FB\Field0 = $02
                            EndIf
                            If ((updatemenubutton((Int ((395.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "rentserver"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                execfile("https://bisecthosting.com/UERM")
                            EndIf
                            If ((updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (30.0 * menuscale)), (Int (30.0 * menuscale)), "S", $09, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                T42DZ064FB\Field0 = $03
                            EndIf
                        Else
                            If ((updatemenubutton((Int ((205.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "addserver"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                X88D840448(getlocalstring("mpmenu", "addserver"), (getlocalstring("mpmenu", "enter_ip") + " (0.0.0.0:0)"), getlocalstring("gui", "add"), getlocalstring("gui", "cancel"), $02, FuncPtr(TXZ88XX80XX), $01, $00)
                                local17 = $01
                            EndIf
                            If ((updatemenubutton((Int ((395.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "host"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                If (opt\Field30 <> 0) Then
                                    randomseed = "666"
                                Else
                                    local9 = rand($04, $08)
                                    For local10 = $01 To local9 Step $01
                                        If (rand($03, $01) = $01) Then
                                            randomseed = (randomseed + (Str rand($00, $09)))
                                        Else
                                            randomseed = (randomseed + chr(rand($61, $7A)))
                                        EndIf
                                    Next
                                EndIf
                                loadsavedgames()
                                currsave = (New save)
                                loadcustommaps()
                                currcustommap = (New custommaps)
                                T42DZ064FB\Field0 = $02
                            EndIf
                            If ((updatemenubutton((Int ((585.0 * menuscale) + local4)), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (180.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpmenu", "rentserver"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                execfile("https://bisecthosting.com/UERM")
                            EndIf
                            If ((updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((((local5 + local7) - (17.0 * menuscale)) - (8.5 * menuscale)) + (6.0 * menuscale))), (Int (30.0 * menuscale)), (Int (30.0 * menuscale)), "S", $09, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) And (TXXBXD22D0F() = $00)) <> 0) Then
                                T42DZ064FB\Field0 = $03
                            EndIf
                        EndIf
                        local5 = ((50.0 * menuscale) + local5)
                        local22 = ((30.0 * menuscale) - (4.0 * menuscale))
                        local23 = 0.0
                        local24 = (local7 - (73.0 * menuscale))
                        local25 = 1.0
                        local26 = $00
                        For local9 = $00 To $3E7 Step $01
                            If (TXX0F66ZBZF[local9] = Null) Then
                                Exit
                            EndIf
                            local26 = (local26 + $01)
                            local23 = (local23 + local22)
                        Next
                        local25 = min((local24 / local23), 1.0)
                        local27 = local5
                        local28 = (((local24 / local22) * local22) + local5)
                        local29 = TXFD22D0402\Field6
                        TXFD22D0402\Field6 = (TXFD22D0402\Field6 + ((Float (- mousezspeed())) * local22))
                        If (local29 <> TXFD22D0402\Field6) Then
                            shoulddeletegadgets = $01
                        EndIf
                        If (mouseon((Int ((local20 - (8.0 * menuscale)) + (3.0 * menuscale))), (Int (((TXFD22D0402\Field6 * local25) + local5) - (6.0 * menuscale))), (Int (((local6 * 0.0215) + (8.0 * menuscale)) - (6.0 * menuscale))), (Int (local24 * local25))) <> 0) Then
                            If ((TDD0Z6BXB6\Field1 And (TXFD22D0402\Field7 = $00)) <> 0) Then
                                TXFD22D0402\Field7 = $01
                                TXFD22D0402\Field0 = (Int mouseposy)
                                local17 = $01
                            EndIf
                        ElseIf (mouseon((Int ((local20 - (4.0 * menuscale)) + (3.0 * menuscale))), (Int (local5 - (4.0 * menuscale))), (Int (((local6 * 0.0215) + (4.0 * menuscale)) - (6.0 * menuscale))), (Int local24)) <> 0) Then
                            If ((TDD0Z6BXB6\Field7 And (TXFD22D0402\Field7 = $00)) <> 0) Then
                                TXFD22D0402\Field6 = ((mouseposy - local5) / local25)
                                local17 = $01
                            EndIf
                        EndIf
                        If (TDD0Z6BXB6\Field1 = $00) Then
                            TXFD22D0402\Field7 = $00
                        ElseIf (TXFD22D0402\Field7 <> 0) Then
                            TXFD22D0402\Field6 = (TXFD22D0402\Field6 + ((mouseposy - (Float TXFD22D0402\Field0)) / local25))
                            TXFD22D0402\Field0 = (Int mouseposy)
                            local17 = $01
                            shoulddeletegadgets = $01
                        EndIf
                        TXFD22D0402\Field6 = clamp(TXFD22D0402\Field6, 0.0, max(((local23 - local24) + (4.0 * menuscale)), 0.0))
                        For local9 = $00 To (local26 - $01) Step $01
                            TXX0F66ZBZF[local9]\Field22 = ((- TXFD22D0402\Field6) + local5)
                            local5 = (local5 + local22)
                        Next
                        For local30 = Each T402X2Z846
                            If (local30\Field13 <> Null) Then
                                deletemenubutton(local30\Field13)
                                local30\Field13 = Null
                            EndIf
                        Next
                        For local9 = $00 To (local26 - $01) Step $01
                            local30 = TXX0F66ZBZF[local9]
                            If ((((local27 - local22) <= local30\Field22) And (local28 >= local30\Field22)) <> 0) Then
                                local31 = mouseon((Int local4), (Int (local30\Field22 - (8.0 * menuscale))), (Int (local6 * 0.977)), (Int (30.0 * menuscale)))
                                local17 = (local17 + (local31 And (local16 = $00)))
                                If ((((TDD0Z6BXB6\Field12 And (local16 = $00)) And (TXXBXD22D0F() = $00)) And local31) <> 0) Then
                                    TXFD22D0402\Field5 = ((Handle local30) + $01)
                                    TXFD22D0402\Field9 = TXFD22D0402\Field5
                                    TXFD22D0402\Field8 = ((Handle local30) + $01)
                                    TXFD22D0402\Field10 = (Int mouseposx)
                                    TXFD22D0402\Field1 = (Int mouseposy)
                                    shoulddeletegadgets = $01
                                EndIf
                                If ((((updatemenubutton((Int local4), (Int (local30\Field22 - (8.0 * menuscale))), (Int (local6 * 0.977)), (Int (30.0 * menuscale)), "", $00, $00, (TXFD22D0402\Field5 = ((Handle local30) + $01)), $FF, $FF, $FF, $00, 1.0, $01, $00) And (local16 = $00)) And (TXFD22D0402\Field8 = $00)) And (TXXBXD22D0F() = $00)) <> 0) Then
                                    If (TXFD22D0402\Field5 <> $00) Then
                                        TDD0Z6BXB6\Field0 = $00
                                    EndIf
                                    TXFD22D0402\Field5 = ((Handle local30) + $01)
                                EndIf
                                If (((((local31 And TDD0Z6BXB6\Field0) And (local16 = $00)) And (TXFD22D0402\Field8 = $00)) And (TXXBXD22D0F() = $00)) <> 0) Then
                                    F4ZXX4FDZ(local30, $00, $00)
                                    TDD0Z6BXB6\Field7 = $00
                                EndIf
                                local30\Field13 = XZ0X0644DD((Int local4), (Int (local30\Field22 - (8.0 * menuscale))), (Int (local6 * 0.977)), (Int (30.0 * menuscale)))
                                local32 = local4
                                local32 = ((local6 * 0.0215) + local32)
                                TB4D26D8ZX((Int (local32 - (4.0 * menuscale))), (Int (local30\Field22 - (8.0 * menuscale))), (Int ((local6 * 0.5457) + (4.0 * menuscale))), (Int (30.0 * menuscale)), local30\Field11, $00, 0.05, $3D)
                                local32 = ((local6 * 0.5457) + local32)
                                TB4D26D8ZX((Int (local32 - (4.0 * menuscale))), (Int (local30\Field22 - (8.0 * menuscale))), (Int ((local6 * 0.18) + (4.0 * menuscale))), (Int (30.0 * menuscale)), local30\Field21, $00, 0.15, $12)
                                local32 = ((local6 * 0.18) + local32)
                                TB4D26D8ZX((Int (local32 - (4.0 * menuscale))), (Int (local30\Field22 - (8.0 * menuscale))), (Int ((local6 * 0.13) + (4.0 * menuscale))), (Int (30.0 * menuscale)), (((Str local30\Field20) + " / ") + (Str local30\Field9)), $00, 0.15, $00)
                                local32 = ((local6 * 0.13) + local32)
                                TB4D26D8ZX((Int (local32 - (4.0 * menuscale))), (Int (local30\Field22 - (8.0 * menuscale))), (Int ((local6 * 0.1013) + (4.0 * menuscale))), (Int (30.0 * menuscale)), (Str local30\Field25), $00, 0.15, $00)
                                If (local30\Field18 <> 0) Then
                                    TB4D26D8ZX((Int local4), (Int (local30\Field22 - (9.5 * menuscale))), (Int (local6 * 0.027)), (Int (30.0 * menuscale)), "C", $09, 1.0, $00)
                                EndIf
                                If (((TXFD22D0402\Field5 = ((Handle local30) + $01)) And (T2FFB8B2F0() > local30\Field15)) <> 0) Then
                                    TD0F2FZBXZ(local30\Field29, local30\Field16, $00, $00)
                                    local30\Field15 = (T2FFB8B2F0() + $5DC)
                                EndIf
                            EndIf
                        Next
                        If (TXFD22D0402\Field8 <> $00) Then
                            local33 = (Object.T402X2Z846 (TXFD22D0402\Field8 - $01))
                            local34 = mouseon(TXFD22D0402\Field10, TXFD22D0402\Field1, (Int (200.0 * menuscale)), (Int (88.0 * menuscale)))
                            local35 = $00
                            If (updatemenubutton(TXFD22D0402\Field10, TXFD22D0402\Field1, (Int (200.0 * menuscale)), (Int (25.0 * menuscale)), getlocalstring("mpmenu", "connect2"), $00, $01, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                F4ZXX4FDZ(local33, $00, $00)
                                local35 = $01
                            EndIf
                            If (updatemenubutton(TXFD22D0402\Field10, (Int (((Float TXFD22D0402\Field1) + (25.0 * menuscale)) - (3.0 * menuscale))), (Int (200.0 * menuscale)), (Int (25.0 * menuscale)), getlocalstring("mpmenu", "openinfo"), $00, $01, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                X88D840448(getlocalstring("mpmenu", "information"), ((((((((((((((((((((((format(getlocalstring("mpmenu", "info.name"), local33\Field11, "%s") + "\n&w[]") + format(getlocalstring("mpmenu", "info.gamemode"), local33\Field21, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.players"), (((Str local33\Field20) + " / ") + (Str local33\Field9)), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.diff"), difficulties[local33\Field28]\Field7, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.seed"), local33\Field6, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.mapsize"), (((Str local33\Field7) + "x") + (Str local33\Field7)), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.intro"), TXX4XX846F(local33\Field19), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.voice"), X8X4D0ZD08(local33\Field17), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.ping"), (Str local33\Field25), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.modded"), TXX4XX846F((local33\Field23 <> "")), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.version"), XZF4X2066X(local33\Field26), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.desc"), local33\Field14, "%s")), getlocalstring("gui", "close"), "", $00, $00, $00, $00)
                                TD0F2FZBXZ(local33\Field29, local33\Field16, $01, $00)
                                local35 = $01
                            EndIf
                            If (updatemenubutton(TXFD22D0402\Field10, (Int (((Float TXFD22D0402\Field1) + (50.0 * menuscale)) - (6.0 * menuscale))), (Int (200.0 * menuscale)), (Int (25.0 * menuscale)), getlocalstring("gui", "update"), $00, $01, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                TD0F2FZBXZ(local33\Field29, local33\Field16, $00, $00)
                                local35 = $01
                            EndIf
                            Select TXFD22D0402\Field3
                                Case $00,$01
                                    If (updatemenubutton(TXFD22D0402\Field10, (Int (((Float TXFD22D0402\Field1) + (75.0 * menuscale)) - (9.0 * menuscale))), (Int (200.0 * menuscale)), (Int (25.0 * menuscale)), getlocalstring("mpmenu", "add_to_favourites"), $00, $01, (XB88ZBFDZ2(local33\Field29, local33\Field16, $03) <> Null), $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                                        YX0B0D2DF6(local33\Field29, local33\Field16, $03)
                                        local35 = $01
                                    EndIf
                                Case $03,$02
                                    If (updatemenubutton(TXFD22D0402\Field10, (Int (((Float TXFD22D0402\Field1) + (75.0 * menuscale)) - (9.0 * menuscale))), (Int (200.0 * menuscale)), (Int (25.0 * menuscale)), getlocalstring("gui", "delete"), $00, $01, $00, $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                                        X0ZZ6X6ZD6(local33)
                                        B24D0X6Z8(TXFD22D0402\Field3)
                                        local35 = $01
                                        local17 = $01
                                    EndIf
                            End Select
                            If (((TDD0Z6BXB6\Field7 And (local34 = $00)) Lor local35) <> 0) Then
                                TXFD22D0402\Field8 = $00
                                shoulddeletegadgets = $01
                            EndIf
                            If (local34 <> 0) Then
                                local17 = $01
                            EndIf
                        EndIf
                        If (((TDD0Z6BXB6\Field7 And (local17 = $00)) And (TXXBXD22D0F() = $00)) <> 0) Then
                            TXFD22D0402\Field5 = $00
                            TDD0Z6BXB6\Field5 = (millisecs() - $15E)
                        EndIf
                    Case $03
                        local7 = (400.0 * menuscale)
                        local38 = $00
                        local39 = $FFFFFFFF
                        For local40 = Each XZ8B4B628
                            If (local40 = T42DZ064FB\Field6) Then
                                local39 = local38
                            EndIf
                            local38 = (local38 + $01)
                            local37 = ((local37 + local40\Field2) + "\n")
                        Next
                        local5 = ((30.0 * menuscale) + local5)
                        local39 = TXZXZ4460F2((Int ((380.0 * menuscale) + local4)), (Int local5), (Int (150.0 * menuscale)), local37, local39)
                        local38 = $00
                        For local40 = Each XZ8B4B628
                            If (local38 = local39) Then
                                T42DZ064FB\Field6 = local40
                                Exit
                            EndIf
                            local38 = (local38 + $01)
                        Next
                        opt\Field42 = T42DZ064FB\Field6\Field1
                    Case $02
                        local7 = (400.0 * menuscale)
                        selectedcustommap = Null
                        T8X2046020\Field6 = updatemenuinputbox((Int ((150.0 * menuscale) + local4)), (Int ((15.0 * menuscale) + local5)), (Int (300.0 * menuscale)), (Int (30.0 * menuscale)), T8X2046020\Field6, $00, $01, $20, 1.0, $00, $00, $00)
                        randomseed = updatemenuinputbox((Int ((150.0 * menuscale) + local4)), (Int ((55.0 * menuscale) + local5)), (Int (200.0 * menuscale)), (Int (30.0 * menuscale)), randomseed, $00, $02, $0F, 1.0, $00, $00, $00)
                        T8X2046020\Field4 = updatemenutick((Int ((150.0 * menuscale) + local4)), (Int ((95.0 * menuscale) + local5)), T8X2046020\Field4, $00)
                        For local9 = $00 To $04 Step $01
                            local3 = selecteddifficulty
                            If (updatemenutick((Int ((20.0 * menuscale) + local4)), (Int (((Float (($1E * local9) + $DC)) * menuscale) + local5)), (selecteddifficulty = difficulties[local9]), $00) <> 0) Then
                                selecteddifficulty = difficulties[local9]
                            EndIf
                            If (local3 <> selecteddifficulty) Then
                                shoulddeletegadgets = (local3 = difficulties[$04])
                            EndIf
                        Next
                        If (selecteddifficulty\Field0 <> 0) Then
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((220.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                If (selecteddifficulty\Field1 < $03) Then
                                    selecteddifficulty\Field1 = (selecteddifficulty\Field1 + $01)
                                Else
                                    selecteddifficulty\Field1 = $00
                                EndIf
                            EndIf
                            selecteddifficulty\Field2 = updatemenutick((Int ((160.0 * menuscale) + local4)), (Int ((252.5 * menuscale) + local5)), selecteddifficulty\Field2, $00)
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((285.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), "<", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                selecteddifficulty\Field4 = (selecteddifficulty\Field4 - $02)
                                If (selecteddifficulty\Field4 <= $00) Then
                                    selecteddifficulty\Field4 = $0A
                                EndIf
                            ElseIf (updatemenubutton((Int ((405.0 * menuscale) + local4)), (Int ((285.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                selecteddifficulty\Field4 = (selecteddifficulty\Field4 + $02)
                                If (selecteddifficulty\Field4 > $0A) Then
                                    selecteddifficulty\Field4 = $02
                                EndIf
                            EndIf
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((315.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                If (selecteddifficulty\Field8 < $03) Then
                                    selecteddifficulty\Field8 = (selecteddifficulty\Field8 + $01)
                                Else
                                    selecteddifficulty\Field8 = $00
                                EndIf
                            EndIf
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((345.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                If (selecteddifficulty\Field10 < $02) Then
                                    selecteddifficulty\Field10 = (selecteddifficulty\Field10 + $01)
                                Else
                                    selecteddifficulty\Field10 = $00
                                EndIf
                            EndIf
                        EndIf
                        If (updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((local5 + local7) + (20.0 * menuscale))), (Int (160.0 * menuscale)), (Int (75.0 * menuscale)), getlocalstring("mpmenu", "host"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            If (TXBD6F626BX($FFFFFFFF) <> 0) Then
                                opt\Field3 = $00
                                currsave\Field2 = ""
                                If (randomseed = "") Then
                                    randomseed = (Str millisecs())
                                EndIf
                                seedrnd(generateseednumber(randomseed))
                                local13 = $00
                                local14 = $02
                                Y0D662BXZZ()
                                initnewgame()
                                iniwritestring(optionfile, "Global", "Enable Intro", (Str opt\Field3), $01)
                                shoulddeletegadgets = $01
                                Return $00
                            EndIf
                        EndIf
                    Case $04
                        local7 = (345.0 * menuscale)
                        currsave\Field2 = updatemenuinputbox((Int ((150.0 * menuscale) + local4)), (Int ((15.0 * menuscale) + local5)), (Int (200.0 * menuscale)), (Int (30.0 * menuscale)), currsave\Field2, $00, $01, $0F, 1.0, $00, $00, $00)
                        If (selectedinputbox = $01) Then
                            currsave\Field2 = replace(currsave\Field2, ":", "")
                            currsave\Field2 = replace(currsave\Field2, ".", "")
                            currsave\Field2 = replace(currsave\Field2, "/", "")
                            currsave\Field2 = replace(currsave\Field2, "\", "")
                            currsave\Field2 = replace(currsave\Field2, "<", "")
                            currsave\Field2 = replace(currsave\Field2, ">", "")
                            currsave\Field2 = replace(currsave\Field2, "|", "")
                            currsave\Field2 = replace(currsave\Field2, "?", "")
                            currsave\Field2 = replace(currsave\Field2, chr($22), "")
                            currsave\Field2 = replace(currsave\Field2, "*", "")
                            cursorpos = (Int min((Float cursorpos), (Float len(currsave\Field2))))
                        EndIf
                        If (selectedcustommap = Null) Then
                            randomseed = updatemenuinputbox((Int ((150.0 * menuscale) + local4)), (Int ((55.0 * menuscale) + local5)), (Int (200.0 * menuscale)), (Int (30.0 * menuscale)), randomseed, $00, $02, $0F, 1.0, $00, $00, $00)
                        ElseIf (updatemenubutton((Int ((370.0 * menuscale) + local4)), (Int ((55.0 * menuscale) + local5)), (Int (120.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "deselect"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            shoulddeletegadgets = $01
                            selectedcustommap = Null
                        EndIf
                        opt\Field3 = updatemenutick((Int ((280.0 * menuscale) + local4)), (Int ((110.0 * menuscale) + local5)), opt\Field3, $00)
                        For local9 = $00 To $04 Step $01
                            local3 = selecteddifficulty
                            If (updatemenutick((Int ((20.0 * menuscale) + local4)), (Int (((Float (($1E * local9) + $B4)) * menuscale) + local5)), (selecteddifficulty = difficulties[local9]), $00) <> 0) Then
                                selecteddifficulty = difficulties[local9]
                            EndIf
                            If (local3 <> selecteddifficulty) Then
                                shoulddeletegadgets = (local3 = difficulties[$04])
                            EndIf
                        Next
                        If (selecteddifficulty\Field0 <> 0) Then
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((180.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                If (selecteddifficulty\Field1 < $03) Then
                                    selecteddifficulty\Field1 = (selecteddifficulty\Field1 + $01)
                                Else
                                    selecteddifficulty\Field1 = $00
                                EndIf
                            EndIf
                            selecteddifficulty\Field2 = updatemenutick((Int ((160.0 * menuscale) + local4)), (Int ((210.0 * menuscale) + local5)), selecteddifficulty\Field2, $00)
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((240.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), "<", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                selecteddifficulty\Field4 = (selecteddifficulty\Field4 - $02)
                                If (selecteddifficulty\Field4 <= $00) Then
                                    selecteddifficulty\Field4 = $0A
                                EndIf
                            ElseIf (updatemenubutton((Int ((405.0 * menuscale) + local4)), (Int ((240.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                selecteddifficulty\Field4 = (selecteddifficulty\Field4 + $02)
                                If (selecteddifficulty\Field4 > $0A) Then
                                    selecteddifficulty\Field4 = $02
                                EndIf
                            EndIf
                            If (updatemenubutton((Int ((160.0 * menuscale) + local4)), (Int ((270.0 * menuscale) + local5)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                If (selecteddifficulty\Field8 < $03) Then
                                    selecteddifficulty\Field8 = (selecteddifficulty\Field8 + $01)
                                Else
                                    selecteddifficulty\Field8 = $00
                                EndIf
                            EndIf
                        EndIf
                        If (updatemenubutton((Int local4), (Int ((local5 + local7) + (20.0 * menuscale))), (Int (160.0 * menuscale)), (Int (75.0 * menuscale)), getlocalstring("menu", "loadmap"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            loadcustommaps()
                            T42DZ064FB\Field0 = $06
                        EndIf
                        If (updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((local5 + local7) + (20.0 * menuscale))), (Int (160.0 * menuscale)), (Int (75.0 * menuscale)), getlocalstring("menu", "start"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            If (currsave\Field2 = "") Then
                                currsave\Field2 = converttoansi(getlocalstring("save", "untitled"))
                            EndIf
                            currsave\Field2 = trim(currsave\Field2)
                            randomseed = trim(randomseed)
                            If (randomseed = "") Then
                                randomseed = (Str millisecs())
                            EndIf
                            seedrnd(generateseednumber(randomseed))
                            local13 = $00
                            local14 = $02
                            For local0 = Each save
                                If (((currsave <> local0) And (currsave\Field2 = local0\Field2)) <> 0) Then
                                    local13 = $01
                                    Exit
                                EndIf
                            Next
                            While (local13 = $01)
                                local13 = $02
                                For local0 = Each save
                                    If (local0\Field2 = (((currsave\Field2 + " (") + (Str local14)) + ")")) Then
                                        local14 = (local14 + $01)
                                        local13 = $01
                                        Exit
                                    EndIf
                                Next
                            Wend
                            If (local13 = $02) Then
                                currsave\Field2 = (((currsave\Field2 + " (") + (Str local14)) + ")")
                            EndIf
                            initnewgame()
                            iniwritestring(optionfile, "Global", "Enable Intro", (Str opt\Field3), $01)
                            shoulddeletegadgets = $01
                            Return $00
                        EndIf
                    Case $05
                        local7 = (296.0 * menuscale)
                        If ((((ceil(((Float savedgamesamount) / 5.0)) - 1.0) > (Float T42DZ064FB\Field3)) And (delsave = Null)) <> 0) Then
                            If (updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), ">", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                changepage((T42DZ064FB\Field3 + $01))
                            EndIf
                        Else
                            updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), ">", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        EndIf
                        If (((T42DZ064FB\Field3 > $00) And (delsave = Null)) <> 0) Then
                            If (updatemenubutton((Int local4), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), "<", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                changepage((T42DZ064FB\Field3 - $01))
                            EndIf
                        Else
                            updatemenubutton((Int local4), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), "<", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        EndIf
                        If ((ceil(((Float savedgamesamount) / 5.0)) - 1.0) < (Float T42DZ064FB\Field3)) Then
                            changepage((T42DZ064FB\Field3 - $01))
                        EndIf
                        If (savedgamesamount > $00) Then
                            local4 = ((20.0 * menuscale) + local4)
                            local5 = ((20.0 * menuscale) + local5)
                            currsave = (First save)
                            For local9 = $00 To ((T42DZ064FB\Field3 * $05) + $04) Step $01
                                If (local9 > $00) Then
                                    currsave = (After currsave)
                                EndIf
                                If (currsave = Null) Then
                                    Exit
                                EndIf
                                If (local9 >= (T42DZ064FB\Field3 * $05)) Then
                                    If (delsave = Null) Then
                                        If (currsave\Field1 <> "2.1.5") Then
                                            updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $01, $FF, $00, $00, $01, 1.0, $00, $00)
                                        ElseIf (updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                            loadentities($00)
                                            loadsounds()
                                            loadgame(currsave\Field2)
                                            initloadgame()
                                            shoulddeletegadgets = $01
                                            Return $00
                                        EndIf
                                        If (updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "delete"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                            delsave = currsave
                                            Exit
                                        EndIf
                                    Else
                                        If (currsave\Field1 <> "2.1.5") Then
                                            updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $01, $FF, $00, $00, $01, 1.0, $00, $00)
                                        Else
                                            updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                                        EndIf
                                        updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "delete"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                                    EndIf
                                    If (currsave = (Last save)) Then
                                        Exit
                                    EndIf
                                    local5 = ((80.0 * menuscale) + local5)
                                EndIf
                            Next
                            If (delsave <> Null) Then
                                local4 = (739.0 * menuscale)
                                local5 = (376.0 * menuscale)
                                If (updatemenubutton((Int ((74.0 * menuscale) + local4)), (Int ((150.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "yes"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                    deletegame(delsave)
                                    shoulddeletegadgets = $01
                                EndIf
                                If (updatemenubutton((Int ((246.0 * menuscale) + local4)), (Int ((150.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "no"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                    delsave = Null
                                    shoulddeletegadgets = $01
                                EndIf
                            EndIf
                        EndIf
                    Case $06
                        local7 = (350.0 * menuscale)
                        If ((((ceil(((Float custommapsamount) / 5.0)) - 1.0) > (Float T42DZ064FB\Field3)) And (delcustommap = Null)) <> 0) Then
                            If (updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), ">", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                changepage((T42DZ064FB\Field3 + $01))
                            EndIf
                        Else
                            updatemenubutton((Int ((local4 + local6) - (50.0 * menuscale))), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), ">", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        EndIf
                        If (((T42DZ064FB\Field3 > $00) And (delcustommap = Null)) <> 0) Then
                            If (updatemenubutton((Int local4), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), "<", $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                changepage((T42DZ064FB\Field3 - $01))
                            EndIf
                        Else
                            updatemenubutton((Int local4), (Int ((440.0 * menuscale) + local5)), (Int (50.0 * menuscale)), (Int (50.0 * menuscale)), "<", $01, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        EndIf
                        If ((ceil(((Float custommapsamount) / 5.0)) - 1.0) < (Float T42DZ064FB\Field3)) Then
                            changepage((T42DZ064FB\Field3 - $01))
                        EndIf
                        If (custommapsamount > $00) Then
                            local4 = ((20.0 * menuscale) + local4)
                            local5 = ((20.0 * menuscale) + local5)
                            currcustommap = (First custommaps)
                            For local9 = $00 To ((T42DZ064FB\Field3 * $05) + $04) Step $01
                                If (local9 > $00) Then
                                    currcustommap = (After currcustommap)
                                EndIf
                                If (currcustommap = Null) Then
                                    Exit
                                EndIf
                                If (local9 >= (T42DZ064FB\Field3 * $05)) Then
                                    If (delcustommap = Null) Then
                                        If (updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                            selectedcustommap = currcustommap
                                            T42DZ064FB\Field0 = $04
                                            shoulddeletegadgets = $01
                                        EndIf
                                        If (updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "delete"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                            delcustommap = currcustommap
                                            Exit
                                        EndIf
                                    Else
                                        updatemenubutton((Int ((300.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "btnload"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                                        updatemenubutton((Int ((420.0 * menuscale) + local4)), (Int ((20.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "delete"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
                                    EndIf
                                    If (currcustommap = (Last custommaps)) Then
                                        Exit
                                    EndIf
                                    local5 = ((80.0 * menuscale) + local5)
                                EndIf
                            Next
                            If (delcustommap <> Null) Then
                                local4 = (739.0 * menuscale)
                                local5 = (376.0 * menuscale)
                                If (updatemenubutton((Int ((74.0 * menuscale) + local4)), (Int ((150.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "yes"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                    deletecustommap(delcustommap)
                                    shoulddeletegadgets = $01
                                EndIf
                                If (updatemenubutton((Int ((246.0 * menuscale) + local4)), (Int ((150.0 * menuscale) + local5)), (Int (100.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("menu", "no"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                    delcustommap = Null
                                    shoulddeletegadgets = $01
                                EndIf
                            EndIf
                        EndIf
                    Case $07
                        local7 = (60.0 * menuscale)
                        If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int ((15.0 * menuscale) + local5)), (Int ((local6 / 5.0) + (420.0 * menuscale))), (Int local7), getlocalstring("options", "grap"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            changeoptiontab($08, $01)
                        EndIf
                        If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int ((85.0 * menuscale) + local5)), (Int ((local6 / 5.0) + (420.0 * menuscale))), (Int local7), getlocalstring("options", "audio"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            changeoptiontab($09, $01)
                        EndIf
                        If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int ((155.0 * menuscale) + local5)), (Int ((local6 / 5.0) + (420.0 * menuscale))), (Int local7), getlocalstring("options", "ctrl"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            changeoptiontab($0A, $01)
                        EndIf
                        If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int ((225.0 * menuscale) + local5)), (Int ((local6 / 5.0) + (420.0 * menuscale))), (Int local7), getlocalstring("options", "avc"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            changeoptiontab($0B, $01)
                        EndIf
                        If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int ((295.0 * menuscale) + local5)), (Int ((local6 / 5.0) + (420.0 * menuscale))), (Int local7), getlocalstring("mpmenu", "opt"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            changeoptiontab($0C, $01)
                        EndIf
                End Select
            Else
                local4 = (390.0 * menuscale)
                local7 = (60.0 * menuscale)
                Select T42DZ064FB\Field0
                    Case $08
                        local5 = ((20.0 * menuscale) + local5)
                        opt\Field50 = (updatemenuslidebar((Int local4), (Int ((5.0 * menuscale) + local5)), (Int (150.0 * menuscale)), (opt\Field50 * 50.0), $01, $01) / 50.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field77 = (updatemenuslidebar((Int local4), (Int ((5.0 * menuscale) + local5)), (Int (150.0 * menuscale)), (opt\Field77 * 50.0), $234, $01) / 50.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field64 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field64 * 2.0), $04, $01) / 2.0)
                        opt\Field15 = (opt\Field64 + 40.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field69 = updatemenuslider3((Int local4), (Int local5), (Int (150.0 * menuscale)), opt\Field69, $02, getlocalstring("options", "min"), getlocalstring("options", "red"), getlocalstring("options", "full"))
                        local5 = ((60.0 * menuscale) + local5)
                        opt\Field76 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), ((((((((getlocalstring("options", "slider.verylow") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")) + "\n") + getlocalstring("options", "slider.ultra")), opt\Field76)
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field6 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), ((((((getlocalstring("options", "disabled") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field6)
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field44 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), ((((getlocalstring("options", "slider.low") + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field44)
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field79 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), (getlocalstring("options", "tri") + "\n2X\n4X\n8X\n16X"), opt\Field79)
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
                        local43 = opt\Field34
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field34 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), ((((((getlocalstring("options", "slider.verylow") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field34)
                        If (opt\Field34 <> local43) Then
                            clearunusedtextures()
                        EndIf
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field71 = TXZXZ4460F2((Int local4), (Int local5), (Int (150.0 * menuscale)), ((((((getlocalstring("options", "disabled") + "\n") + getlocalstring("options", "slider.low")) + "\n") + getlocalstring("options", "slider.medium")) + "\n") + getlocalstring("options", "slider.high")), opt\Field71)
                        local5 = ((60.0 * menuscale) + local5)
                        opt\Field16 = updatemenutick((Int local4), (Int local5), opt\Field16, $00)
                        opt\Field7 = updatemenutick((Int ((200.0 * menuscale) + local4)), (Int local5), opt\Field7, $00)
                        local5 = ((25.0 * menuscale) + local5)
                        opt\Field63 = updatemenutick((Int local4), (Int local5), opt\Field63, $00)
                        opt\Field70 = updatemenutick((Int ((200.0 * menuscale) + local4)), (Int local5), opt\Field70, $00)
                        local5 = ((25.0 * menuscale) + local5)
                        opt\Field10 = updatemenutick((Int local4), (Int local5), opt\Field10, $00)
                        opt\Field23 = updatemenutick((Int ((200.0 * menuscale) + local4)), (Int local5), opt\Field23, $00)
                        local5 = ((25.0 * menuscale) + local5)
                        opt\Field17 = updatemenutick((Int local4), (Int local5), opt\Field17, $00)
                        opt\Field47 = updatemenutick((Int ((200.0 * menuscale) + local4)), (Int local5), opt\Field47, $00)
                        local5 = ((25.0 * menuscale) + local5)
                    Case $09
                        local4 = (390.0 * menuscale)
                        local5 = (376.0 * menuscale)
                        local6 = (580.0 * menuscale)
                        local7 = (60.0 * menuscale)
                        local5 = ((20.0 * menuscale) + local5)
                        opt\Field5 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field2 * 100.0), $01, $01) / 100.0)
                        opt\Field2 = opt\Field5
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field45 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field45 * 100.0), $02, $01) / 100.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field13 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field13 * 100.0), $03, $01) / 100.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field59 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field59 * 100.0), $04, $01) / 100.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field73 = updatemenutick((Int local4), (Int local5), opt\Field73, $00)
                        If (opt\Field72 <> opt\Field73) Then
                            If (opt\Field73 <> 0) Then
                                For local2 = Each sound
                                    For local9 = $00 To $0F Step $01
                                        StopChannel(local2\Field2[local9])
                                        local2\Field2[local9] = $00
                                    Next
                                    If (local2\Field0 <> $00) Then
                                        FreeSound(local2\Field0)
                                        local2\Field0 = $00
                                    EndIf
                                    local2\Field1 = $00
                                Next
                            Else
                                For local2 = Each sound
                                    If (local2\Field0 = $00) Then
                                        local2\Field0 = LoadSound(local2\Field3)
                                    EndIf
                                Next
                            EndIf
                            opt\Field72 = opt\Field73
                        EndIf
                        local5 = ((30.0 * menuscale) + local5)
                        local44 = opt\Field81
                        If (updatemenubutton((Int local4), (Int local5), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            If (opt\Field81 < $02) Then
                                opt\Field81 = (opt\Field81 + $01)
                            Else
                                opt\Field81 = $00
                            EndIf
                        EndIf
                        If (opt\Field81 > $00) Then
                            If (updatemenubutton((Int (local4 - (290.0 * menuscale))), (Int ((30.0 * menuscale) + local5)), (Int (220.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("options", "scantracks"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                usertrackcheck = $00
                                usertrackcheck2 = $00
                                local45 = "SFX\Radio\UserTracks\"
                                If (filetype(local45) <> $02) Then
                                    createdir(local45)
                                EndIf
                                local46 = readdir(local45)
                                Repeat
                                    local11 = nextfile(local46)
                                    If (local11 = "") Then
                                        Exit
                                    EndIf
                                    If (filetype((local45 + local11)) = $01) Then
                                        usertrackcheck = (usertrackcheck + $01)
                                        local12 = LoadSound((local45 + local11))
                                        If (local12 <> $00) Then
                                            usertrackcheck2 = (usertrackcheck2 + $01)
                                        EndIf
                                        FreeSound(local12)
                                        local12 = $00
                                    EndIf
                                Forever
                                closedir(local46)
                            EndIf
                            local5 = ((40.0 * menuscale) + local5)
                        EndIf
                        local5 = ((30.0 * menuscale) + local5)
                        local47 = opt\Field53
                        local48 = opt\Field57
                        opt\Field53 = updatemenutick((Int local4), (Int local5), opt\Field53, $00)
                        If (opt\Field53 <> 0) Then
                            local5 = ((30.0 * menuscale) + local5)
                            opt\Field57 = updatemenutick((Int local4), (Int local5), opt\Field57, $00)
                        EndIf
                        If ((opt\Field53 And opt\Field57) <> 0) Then
                            local5 = ((35.0 * menuscale) + local5)
                            updatemenupalette((Int (local4 - (63.0 * menuscale))), (Int local5))
                            local5 = ((30.0 * menuscale) + local5)
                            opt\Field8 = (Int min((Float updatemenuinputbox((Int (local4 - (135.0 * menuscale))), (Int local5), (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field8), $00, $10, $03, 1.0, $00, $00, $00)), 255.0))
                            local5 = ((30.0 * menuscale) + local5)
                            opt\Field52 = (Int min((Float updatemenuinputbox((Int (local4 - (135.0 * menuscale))), (Int local5), (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field52), $00, $11, $03, 1.0, $00, $00, $00)), 255.0))
                            local5 = ((30.0 * menuscale) + local5)
                            opt\Field1 = (Int min((Float updatemenuinputbox((Int (local4 - (135.0 * menuscale))), (Int local5), (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), (Str opt\Field1), $00, $12, $03, 1.0, $00, $00, $00)), 255.0))
                            local5 = ((40.0 * menuscale) + local5)
                        EndIf
                        If (((local47 Lor local48) Lor (local44 <> $01)) <> 0) Then
                            shoulddeletegadgets = (((local47 <> opt\Field53) Lor (local48 <> opt\Field57)) Lor (local44 <> opt\Field81))
                        EndIf
                    Case $0A
                        local49 = selectedinputbox
                        local5 = ((20.0 * menuscale) + local5)
                        opt\Field65 = ((updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), ((opt\Field65 + 0.5) * 100.0), $01, $01) / 100.0) - 0.5)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field39 = (updatemenuslidebar((Int local4), (Int local5), (Int (150.0 * menuscale)), (opt\Field39 * 50.0), $02, $01) / 50.0)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field0 = updatemenutick((Int local4), (Int local5), opt\Field0, $00)
                        local5 = ((40.0 * menuscale) + local5)
                        opt\Field18 = updatemenutick((Int local4), (Int local5), opt\Field18, $00)
                        local5 = ((60.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field5), 264.0))], $00, $03, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field4), 264.0))], $00, $08, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field7), 264.0))], $00, $04, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field8), 264.0))], $00, $09, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field16), 264.0))], $00, $05, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field13), 264.0))], $00, $0A, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field6), 264.0))], $00, $06, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field15), 264.0))], $00, $0B, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field12), 264.0))], $00, $07, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field1), 264.0))], $00, $0D, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field19), 264.0))], $00, $0E, $00, 1.0, $00, $00, $01)
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field18), 264.0))], $00, $0F, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        If (opt\Field28 <> 0) Then
                            updatemenuinputbox((Int (local4 - (150.0 * menuscale))), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field11), 264.0))], $00, $0C, $00, 1.0, $00, $00, $01)
                        EndIf
                        updatemenuinputbox((Int ((140.0 * menuscale) + local4)), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field2), 264.0))], $00, $10, $00, 1.0, $00, $00, $01)
                        local50 = $00
                        If (((TDD0Z6BXB6\Field7 And (local49 = selectedinputbox)) And (selectedinputbox <> $00)) <> 0) Then
                            local50 = $100
                        EndIf
                        If (selectedinputbox <> $00) Then
                            For local9 = $00 To $107 Step $01
                                If (keyhit(local9) <> 0) Then
                                    local50 = local9
                                    Exit
                                EndIf
                            Next
                            If (local50 <> $00) Then
                                Select selectedinputbox
                                    Case $03
                                        key\Field5 = local50
                                    Case $04
                                        key\Field7 = local50
                                    Case $05
                                        key\Field16 = local50
                                    Case $06
                                        key\Field6 = local50
                                    Case $07
                                        key\Field12 = local50
                                    Case $08
                                        key\Field4 = local50
                                    Case $09
                                        key\Field8 = local50
                                    Case $0A
                                        key\Field13 = local50
                                    Case $0B
                                        key\Field15 = local50
                                    Case $0C
                                        key\Field11 = local50
                                    Case $0D
                                        key\Field1 = local50
                                    Case $0E
                                        key\Field19 = local50
                                    Case $0F
                                        key\Field18 = local50
                                    Case $10
                                        key\Field2 = local50
                                End Select
                                selectedinputbox = $00
                            EndIf
                        EndIf
                    Case $0B
                        local5 = ((20.0 * menuscale) + local5)
                        opt\Field68 = updatemenutick((Int local4), (Int local5), opt\Field68, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        local52 = opt\Field28
                        opt\Field28 = updatemenutick((Int local4), (Int local5), opt\Field28, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        If (opt\Field28 <> 0) Then
                            opt\Field62 = updatemenutick((Int local4), (Int local5), opt\Field62, $00)
                        EndIf
                        local5 = ((30.0 * menuscale) + local5)
                        opt\Field51 = updatemenutick((Int local4), (Int local5), opt\Field51, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        opt\Field35 = updatemenutick((Int local4), (Int local5), opt\Field35, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        opt\Field49 = updatemenutick((Int local4), (Int local5), opt\Field49, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        local53 = (0.0 < opt\Field29)
                        If (updatemenutick((Int local4), (Int local5), (0.0 < opt\Field29), $00) <> 0) Then
                            opt\Field29 = (updatemenuslidebar((Int (local4 - (160.0 * menuscale))), (Int ((40.0 * menuscale) + local5)), (Int (150.0 * menuscale)), (opt\Field29 * 99.0), $01, $01) / 99.0)
                            opt\Field29 = max(opt\Field29, 0.01)
                            opt\Field67 = (Int ((opt\Field29 * 100.0) + 19.0))
                            local5 = ((80.0 * menuscale) + local5)
                        Else
                            opt\Field29 = 0.0
                            opt\Field67 = $00
                            local5 = ((30.0 * menuscale) + local5)
                        EndIf
                        If ((local53 Lor local52) <> 0) Then
                            shoulddeletegadgets = (((Float local53) <> opt\Field29) Lor (local52 <> opt\Field28))
                        EndIf
                        opt\Field11 = updatemenutick((Int local4), (Int local5), opt\Field11, $00)
                        local5 = ((30.0 * menuscale) + local5)
                        opt\Field40 = updatemenutick((Int local4), (Int local5), opt\Field40, $00)
                        local5 = ((40.0 * menuscale) + local5)
                        If (updatemenubutton((Int (local4 - (290.0 * menuscale))), (Int local5), (Int (195.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("options", "reset"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                            deletefile(optionfile)
                            resetoptionsini()
                            saveoptionsini($01)
                        EndIf
                    Case $0C
                        local49 = selectedinputbox
                        local5 = ((20.0 * menuscale) + local5)
                        local4 = (local4 - (170.0 * menuscale))
                        opt\Field75 = left(updatemenuinputbox((Int ((20.0 * menuscale) + local4)), (Int (local5 - (5.0 * menuscale))), (Int (400.0 * menuscale)), (Int (30.0 * menuscale)), opt\Field75, $00, $424, $00, 1.0, $00, $00, $00), $1F)
                        local5 = ((35.0 * menuscale) + local5)
                        If (((opt\Field24 = "") And (T20DD48F0X6() > $00)) <> 0) Then
                            opt\Field24 = T2ZB824444($00)
                        EndIf
                        If (opt\Field24 = "") Then
                            updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int local5), (Int (400.0 * menuscale)), (Int (30.0 * menuscale)), getlocalstring("mpoptions", "nullvoice"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00)
                        Else
                            local54 = opt\Field24
                            If (len(local54) > $25) Then
                                local54 = left(opt\Field24, $25)
                                local54 = (local54 + "...")
                            EndIf
                            If (updatemenubutton((Int ((20.0 * menuscale) + local4)), (Int local5), (Int (400.0 * menuscale)), (Int (30.0 * menuscale)), local54, $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                                local55 = T20DD48F0X6()
                                If (local55 > $00) Then
                                    local56 = $00
                                    For local9 = $00 To (local55 - $01) Step $01
                                        If (T2ZB824444(local9) = opt\Field24) Then
                                            local56 = local9
                                            Exit
                                        EndIf
                                    Next
                                    local56 = (local56 + $01)
                                    If (local56 >= local55) Then
                                        local56 = $00
                                    EndIf
                                    opt\Field24 = T2ZB824444(local56)
                                EndIf
                            EndIf
                        EndIf
                        local5 = ((45.0 * menuscale) + local5)
                        opt\Field41 = (updatemenuslidebar((Int ((70.0 * menuscale) + local4)), (Int local5), (Int (150.0 * menuscale)), (opt\Field41 * 100.0), $01, $01) / 100.0)
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field80 = updatemenutick((Int ((70.0 * menuscale) + local4)), (Int local5), opt\Field80, $00)
                        local5 = ((35.0 * menuscale) + local5)
                        opt\Field74 = updatemenutick((Int ((70.0 * menuscale) + local4)), (Int local5), opt\Field74, $00)
                        local5 = ((70.0 * menuscale) + local5)
                        updatemenuinputbox((Int local4), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field9), 264.0))], $00, $425, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int local4), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field17), 264.0))], $00, $426, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int local4), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field10), 264.0))], $00, $427, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int local4), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field14), 264.0))], $00, $428, $00, 1.0, $00, $00, $01)
                        local5 = ((20.0 * menuscale) + local5)
                        updatemenuinputbox((Int local4), (Int local5), (Int (110.0 * menuscale)), (Int (20.0 * menuscale)), key\Field0[(Int min((Float key\Field3), 264.0))], $00, $429, $00, 1.0, $00, $00, $01)
                        local50 = $00
                        If (((TDD0Z6BXB6\Field7 And (local49 = selectedinputbox)) And (selectedinputbox <> $00)) <> 0) Then
                            local50 = $100
                        EndIf
                        If (selectedinputbox <> $424) Then
                            For local9 = $00 To $107 Step $01
                                If (keyhit(local9) <> 0) Then
                                    local50 = local9
                                    Exit
                                EndIf
                            Next
                            If (local50 <> $00) Then
                                Select selectedinputbox
                                    Case $425
                                        key\Field9 = local50
                                    Case $426
                                        key\Field17 = local50
                                    Case $427
                                        key\Field10 = local50
                                    Case $428
                                        key\Field14 = local50
                                    Case $429
                                        key\Field3 = local50
                                End Select
                                selectedinputbox = $00
                            EndIf
                        EndIf
                End Select
            EndIf
            local4 = (80.0 * menuscale)
            local5 = (286.0 * menuscale)
            local6 = (400.0 * menuscale)
            local7 = (70.0 * menuscale)
            If (T42DZ064FB\Field0 = $01) Then
                local6 = (900.0 * menuscale)
            EndIf
            If (T42DZ064FB\Field0 <> $09) Then
                usertrackcheck = $00
                usertrackcheck2 = $00
            EndIf
            If ((((delsave = Null) And (delcustommap = Null)) And (TX6X48DXXDX = $00)) <> 0) Then
                If ((updatemenubutton((Int ((local4 + local6) + (20.0 * menuscale))), (Int local5), (Int (160.0 * menuscale)), (Int local7), getlocalstring("menu", "back"), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) Lor ((TX6X48DXXDX = $00) And keyhit($01))) <> 0) Then
                    Select T42DZ064FB\Field0
                        Case $01
                            T42DZ064FB\Field0 = $00
                        Case $03
                            saveoptionsini($00)
                            T42DZ064FB\Field0 = $01
                        Case $02
                            T42DZ064FB\Field0 = $01
                        Case $04
                            iniwritestring(optionfile, "Global", "Enable Intro", (Str opt\Field3), $01)
                            For local0 = Each save
                                Delete local0
                            Next
                            For local1 = Each custommaps
                                Delete local1
                            Next
                            T42DZ064FB\Field0 = $00
                        Case $05
                            T42DZ064FB\Field3 = $00
                            For local0 = Each save
                                Delete local0
                            Next
                            T42DZ064FB\Field0 = $00
                        Case $06
                            T42DZ064FB\Field3 = $00
                            For local1 = Each custommaps
                                Delete local1
                            Next
                            T42DZ064FB\Field0 = $04
                        Case $07
                            saveoptionsini($00)
                            usertrackcheck = $00
                            usertrackcheck2 = $00
                            X0Z8F04D04()
                            T42DZ064FB\Field0 = $00
                        Case $0C
                            T42DZ064FB\Field0 = $07
                        Case $08,$09,$0A,$0B
                            T42DZ064FB\Field0 = $07
                        Default
                            T42DZ064FB\Field0 = $00
                    End Select
                    resetinput(2.0)
                EndIf
            Else
                updatemenubutton((Int ((local4 + local6) + (20.0 * menuscale))), (Int local5), (Int (160.0 * menuscale)), (Int local7), getlocalstring("menu", "back"), $00, $00, $01, $FF, $FF, $FF, $01, 1.0, $00, $00)
            EndIf
        EndIf
        X0200DFZ4($0A)
        updateworld(1.0, 0.0)
    Wend
    If (mainmenuopen = $00) Then
        Return $00
    EndIf
    rendermainmenu()
    catcherrors("Uncaught: UpdateMainMenu()")
    Return $00
End Function
