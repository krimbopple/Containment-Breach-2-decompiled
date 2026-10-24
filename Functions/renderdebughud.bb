Function renderdebughud%()
    Local local0.events
    Local local1.chunk
    Local local2.rooms
    Local local3%
    Local local4%
    Local local5%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13.items
    local3 = (Int (20.0 * menuscale))
    local4 = (Int (40.0 * menuscale))
    color($FF, $FF, $FF, $FF)
    setfontex(XD00026ZX2\Field0[$05])
    Select chs\Field4
        Case $01
            textex(local3, local4, format(getlocalstring("misc", "room"), ((("ID: " + (Str playerroom\Field22\Field21)) + "; Name: ") + playerroom\Field22\Field12), "%s"), $00, $00)
            textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_1.xyz"), (Str floor(((entityx(playerroom\Field15, $00, 1.0) / 8.0) + 0.5))), "{0}"), (Str floor(((entityz(playerroom\Field15, $00, 1.0) / 8.0) + 0.5))), "{1}"), (Str playerroom\Field21), "{2}"), $00, $00)
            For local0 = Each events
                If (local0\Field19 = playerroom) Then
                    textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.event_new"), (Str local0\Field32), "%s"), $00, $00)
                    textex(local3, (Int ((60.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.state_1"), (Str local0\Field4), "%s"), $00, $00)
                    textex(local3, (Int ((80.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.state_2"), (Str local0\Field7), "%s"), $00, $00)
                    textex(local3, (Int ((100.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.state_3"), (Str local0\Field1), "%s"), $00, $00)
                    textex(local3, (Int ((120.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.state_4"), (Str local0\Field23), "%s"), $00, $00)
                    textex(local3, (Int ((140.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.str"), local0\Field9, "%s"), $00, $00)
                    Exit
                EndIf
            Next
            If (playerroom\Field22\Field21 = $70) Then
                textex(local3, (Int ((180.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_1.chunkxyz"), (Str (Int ((entityx(XZ0260X8X2\Field74, $00, 1.0) + 20.0) / 40.0))), "{0}"), (Str (Int ((entityz(XZ0260X8X2\Field74, $00, 1.0) + 20.0) / 40.0))), "{1}"), $00, $00)
                local7 = $00
                For local1 = Each chunk
                    local7 = (local7 + $01)
                Next
                textex(local3, (Int ((200.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.currchunk"), (Str local7), "%s"), $00, $00)
            Else
                textex(local3, (Int ((200.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_1.currroom"), (Str playerroom\Field40), "{0}"), (Str playerroom\Field3), "{1}"), (Str playerroom\Field37), "{2}"), $00, $00)
            EndIf
            If (sc_i\Field1 = Null) Then
                textex(local3, (Int ((240.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.currmon"), "Null", "%s"), $00, $00)
            EndIf
            If (selecteditem <> Null) Then
                textex(local3, (Int ((280.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.curritem"), ((("ID: " + (Str selecteditem\Field6\Field9)) + "; Name: ") + selecteditem\Field6\Field19), "%s"), $00, $00)
            ElseIf (d_i\Field15 = $00) Then
                textex(local3, (Int ((280.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.currbtn"), "Null", "%s"), $00, $00)
            EndIf
            textex(local3, (Int ((320.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.currflo"), (Str infacility), "%s"), $00, $00)
            textex(local3, (Int ((340.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.roomflo"), (Str toelevatorfloor), "%s"), $00, $00)
            textex(local3, (Int ((360.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.inelev"), (Str XZ0260X8X2\Field27), "%s"), $00, $00)
            textex(local3, (Int ((400.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_1.time"), currentdate(), "{0}"), currenttime(), "{1}"), $00, $00)
            textex(local3, (Int ((420.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_1.vidmem"), (Str (Int max((Float (totalvidmem() - availvidmem())), 0.0))), "{0}"), (Str totalvidmem()), "{1}"), $00, $00)
            textex(local3, (Int ((440.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_1.glomem"), (Str (opt\Field25 - (availphys() Sar $0A))), "{0}"), (Str opt\Field25), "{1}"), $00, $00)
            textex(local3, (Int ((460.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.triamo"), (Str currtrisamount), "%s"), $00, $00)
            textex(local3, (Int ((480.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.batch"), (Str X4D6XF2442), "%s"), $00, $00)
            textex(local3, (Int ((500.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_1.acttex"), (Str activetextures()), "%s"), $00, $00)
        Case $02
            tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, playerroom\Field15)
            textex(local3, local4, format(format(format(getlocalstring("console", "debug_2.ppos"), floattostring(tformedx(), $01), "{0}"), floattostring(tformedy(), $01), "{1}"), floattostring(tformedz(), $01), "{2}"), $00, $00)
            textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_2.pcampos"), floattostring(entityx(camera, $00, 1.0), $01), "{0}"), floattostring(entityy(camera, $00, 1.0), $01), "{1}"), floattostring(entityz(camera, $00, 1.0), $01), "{2}"), $00, $00)
            textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_2.prot"), floattostring(entitypitch(XZ0260X8X2\Field74, $00, 1.0), $01), "{0}"), floattostring(entityyaw(XZ0260X8X2\Field74, $00, 1.0), $01), "{1}"), floattostring(entityroll(XZ0260X8X2\Field74, $00, 1.0), $01), "{2}"), $00, $00)
            textex(local3, (Int ((80.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.injuries"), (Str XZ0260X8X2\Field11), "%s"), $00, $00)
            textex(local3, (Int ((100.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.bloodloss"), (Str XZ0260X8X2\Field39), "%s"), $00, $00)
            textex(local3, (Int ((140.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.blur"), (Str XZ0260X8X2\Field64), "%s"), $00, $00)
            textex(local3, (Int ((160.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.blink"), (Str XZ0260X8X2\Field8), "%s"), $00, $00)
            textex(local3, (Int ((180.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.flash"), (Str XZ0260X8X2\Field78), "%s"), $00, $00)
            textex(local3, (Int ((220.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.freq"), (Str XZ0260X8X2\Field12), "%s"), $00, $00)
            textex(local3, (Int ((240.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.timer"), (Str XZ0260X8X2\Field53), "%s"), $00, $00)
            textex(local3, (Int ((260.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.effect"), (Str XZ0260X8X2\Field7), "%s"), $00, $00)
            textex(local3, (Int ((280.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.efftim"), (Str XZ0260X8X2\Field30), "%s"), $00, $00)
            textex(local3, (Int ((300.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.eyeirr"), (Str XZ0260X8X2\Field70), "%s"), $00, $00)
            textex(local3, (Int ((320.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.eyestuck"), (Str XZ0260X8X2\Field43), "%s"), $00, $00)
            textex(local3, (Int ((360.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.stamina"), (Str XZ0260X8X2\Field56), "%s"), $00, $00)
            textex(local3, (Int ((380.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.stameff"), (Str XZ0260X8X2\Field65), "%s"), $00, $00)
            textex(local3, (Int ((400.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.stamtimer"), (Str XZ0260X8X2\Field34), "%s"), $00, $00)
            textex(local3, (Int ((440.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.deaf"), (Str XZ0260X8X2\Field9), "%s"), $00, $00)
            textex(local3, (Int ((460.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.sanity"), (Str XZ0260X8X2\Field42), "%s"), $00, $00)
            local3 = (Int ((700.0 * menuscale) + (Float local3)))
            textex(local3, local4, format(getlocalstring("console", "debug_2.terminated"), (Str XZ0260X8X2\Field48), "%s"), $00, $00)
            textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.death"), (Str XZ0260X8X2\Field26), "%s"), $00, $00)
            textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.fall"), (Str XZ0260X8X2\Field52), "%s"), $00, $00)
            textex(local3, (Int ((80.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.heal"), (Str XZ0260X8X2\Field45), "%s"), $00, $00)
            textex(local3, (Int ((120.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.heartbeat"), (Str XZ0260X8X2\Field83), "%s"), $00, $00)
            textex(local3, (Int ((160.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.explosion"), (Str XZ0260X8X2\Field33), "%s"), $00, $00)
            textex(local3, (Int ((200.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.speed"), (Str XZ0260X8X2\Field76), "%s"), $00, $00)
            textex(local3, (Int ((240.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.camshake"), (Str XZ0260X8X2\Field60), "%s"), $00, $00)
            textex(local3, (Int ((260.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.camzoom"), (Str XZ0260X8X2\Field51), "%s"), $00, $00)
            textex(local3, (Int ((300.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.vomit"), (Str XZ0260X8X2\Field82), "%s"), $00, $00)
            textex(local3, (Int ((340.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.playable"), (Str XZ0260X8X2\Field38), "%s"), $00, $00)
            textex(local3, (Int ((380.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.refitems"), (Str XZ0260X8X2\Field80), "%s"), $00, $00)
            textex(local3, (Int ((400.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.itemamount"), (Str TXZ0ZBZBFF0()), "%s"), $00, $00)
            textex(local3, (Int ((440.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_2.escape"), (Str escapetimer), "%s"), $00, $00)
            textex(local3, (Int ((480.0 * menuscale) + (Float local4))), ("Drop Speed: " + (Str XZ0260X8X2\Field16)), $00, $00)
        Case $03
            If (n_i\Field8 <> Null) Then
                textex(local3, local4, format(format(format(getlocalstring("console", "debug_3.049pos"), floattostring(entityx(n_i\Field8\Field98, $00, 1.0), $02), "{0}"), floattostring(entityy(n_i\Field8\Field98, $00, 1.0), $02), "{1}"), floattostring(entityz(n_i\Field8\Field98, $00, 1.0), $02), "{2}"), $00, $00)
                textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.049idle"), (Str n_i\Field8\Field31), "%s"), $00, $00)
                textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.049state"), (Str n_i\Field8\Field66), "%s"), $00, $00)
            EndIf
            If (n_i\Field10 <> Null) Then
                textex(local3, (Int ((60.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_3.096pos"), floattostring(entityx(n_i\Field10\Field98, $00, 1.0), $02), "{0}"), floattostring(entityy(n_i\Field10\Field98, $00, 1.0), $02), "{1}"), floattostring(entityz(n_i\Field10\Field98, $00, 1.0), $02), "{2}"), $00, $00)
                textex(local3, (Int ((80.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.096idle"), (Str n_i\Field10\Field31), "%s"), $00, $00)
                textex(local3, (Int ((100.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.096state"), (Str n_i\Field10\Field66), "%s"), $00, $00)
            EndIf
            If (n_i\Field2 <> Null) Then
                textex(local3, (Int ((120.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_3.106pos"), floattostring(entityx(n_i\Field2\Field98, $00, 1.0), $02), "{0}"), floattostring(entityy(n_i\Field2\Field98, $00, 1.0), $02), "{1}"), floattostring(entityz(n_i\Field2\Field98, $00, 1.0), $02), "{2}"), $00, $00)
                textex(local3, (Int ((140.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.106idle"), (Str n_i\Field2\Field31), "%s"), $00, $00)
                textex(local3, (Int ((160.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_3.106state"), "1", "{0}"), (Str n_i\Field2\Field66), "{1}"), $00, $00)
                textex(local3, (Int ((180.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_3.106state"), "2", "{0}"), (Str n_i\Field2\Field65), "{1}"), $00, $00)
                textex(local3, (Int ((200.0 * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_3.106state"), "3", "{0}"), (Str n_i\Field2\Field57), "{1}"), $00, $00)
            EndIf
            If (n_i\Field3 <> Null) Then
                textex(local3, (Int ((220.0 * menuscale) + (Float local4))), format(format(format(getlocalstring("console", "debug_3.173pos"), floattostring(entityx(n_i\Field3\Field98, $00, 1.0), $02), "{0}"), floattostring(entityy(n_i\Field3\Field98, $00, 1.0), $02), "{1}"), floattostring(entityz(n_i\Field3\Field98, $00, 1.0), $02), "{2}"), $00, $00)
                textex(local3, (Int ((240.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.173idle"), (Str n_i\Field3\Field31), "%s"), $00, $00)
                textex(local3, (Int ((260.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.173state"), (Str n_i\Field3\Field66), "%s"), $00, $00)
            EndIf
            textex(local3, (Int ((340.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.009"), (Str i_009\Field0), "%s"), $00, $00)
            textex(local3, (Int ((360.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.409"), (Str i_409\Field0), "%s"), $00, $00)
            textex(local3, (Int ((380.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.427"), (Str (i_427\Field1 / 70.0)), "%s"), $00, $00)
            textex(local3, (Int ((400.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.966"), (Str (i_966\Field0 / 70.0)), "%s"), $00, $00)
            textex(local3, (Int ((420.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.1048a"), (Str i_1048a\Field2), "%s"), $00, $00)
            For local5 = $00 To $06 Step $01
                textex(local3, (Int (((Float (($14 * local5) + $1B8)) * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_3.1025"), (Str local5), "{0}"), (Str i_1025\Field0[local5]), "{1}"), $00, $00)
            Next
            For local5 = $00 To $04 Step $01
                textex(local3, (Int (((Float (($14 * local5) + $244)) * menuscale) + (Float local4))), format(format(getlocalstring("console", "debug_3.f.1025"), (Str local5), "{0}"), (Str i_1025\Field1[local5]), "{1}"), $00, $00)
            Next
            local3 = (Int ((700.0 * menuscale) + (Float local3)))
            If (i_005\Field0 = $01) Then
                textex(local3, local4, getlocalstring("console", "debug_3.005.chamber"), $00, $00)
            ElseIf (i_005\Field0 = $02) Then
                textex(local3, local4, getlocalstring("console", "debug_3.005.409"), $00, $00)
            Else
                textex(local3, local4, getlocalstring("console", "debug_3.005.maynard"), $00, $00)
            EndIf
            local8 = (Int max((Float ((((Y0DBXD6BBZ(achievementsindex) - $04) - (Y0DBXD6BBZ(unlockedachievements) - $01)) - TX6ZD06226X(unlockedachievements, "apollyon")) * (selecteddifficulty\Field8 + $05))), 0.0))
            textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.OmniChance.Any"), (Str (local8 + $01)), "%s"), $00, $00)
            textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.OmniChance.5"), (Str ((local8 Sar $01) + $01)), "%s"), $00, $00)
            local9 = $00
            local10 = $00
            For local2 = Each rooms
                local11 = local2\Field22\Field21
                If (((((((local11 <> $04) And (local11 <> $4C)) And (local11 <> $4E)) And $72) And (local11 <> $6F)) And (local11 <> $70)) <> 0) Then
                    local9 = (local9 + $01)
                    local10 = (local10 + local2\Field7)
                EndIf
            Next
            textex(local3, (Int ((60.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_3.NavUltiChance"), (Str (Int max((Float ((local9 - (local10 Shl $01)) * (selecteddifficulty\Field8 + $01))), 1.0))), "%s"), $00, $00)
        Case $04
            textex(local3, (Int ((20.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_4.MultiplayerIP"), (Str T8X2046020\Field25), "%s"), $00, $00)
            textex(local3, (Int ((40.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_4.MultiplayerID"), (Str TXXDZB2ZBXX()), "%s"), $00, $00)
            textex(local3, (Int ((60.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_4.MultiplayerNR"), (((Str ((Float TX4XZ0B2Z4B()) / 1024.0)) + " ") + getlocalstring("console", "debug_4.MultiplayerNR_kb")), "%s"), $00, $00)
            textex(local3, (Int ((80.0 * menuscale) + (Float local4))), format(getlocalstring("console", "debug_4.MultiplayerObj"), (Str CZB6XB84()), "%s"), $00, $00)
            local12 = $00
            For local13 = Each items
                local12 = (local12 + $01)
            Next
            textex(local3, (Int ((100.0 * menuscale) + (Float local4))), ("Items count: " + (Str local12)), $00, $00)
    End Select
    setfontex(XD00026ZX2\Field0[$00])
    Return $00
End Function
