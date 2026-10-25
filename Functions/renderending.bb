Function renderending%()
    Local local0%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6.itemtemplates
    Local local7.rooms
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17$
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    showpointer()
    local0 = (Int max(((XZ0260X8X2\Field2 * 2.8) + 255.0), 0.0))
    Select XZ0260X8X2\Field40
        Case $00,$03
            clscolor(local0, local0, local0, $FF)
        Default
            clscolor($00, $00, $00, $FF)
    End Select
    cls()
    If (-200.0 > XZ0260X8X2\Field2) Then
        If (-700.0 < XZ0260X8X2\Field2) Then
            If (min(((Abs XZ0260X8X2\Field2) - 200.0), 155.0) > (Float rand($96, $01))) Then
                eax_002D = (Int ((Float TDD0Z6BXB6\Field6) - (400.0 * menuscale)))
                drawblock(XZ0260X8X2\Field49, (Int ((Float TDD0Z6BXB6\Field9) - (400.0 * menuscale))), $00, $00)
            Else
                color($00, $00, $00, $FF)
                rect($64, $64, eax_002D, (opt\Field46 - $C8), $01)
                color($FF, $FF, $FF, $FF)
            EndIf
        Else
            drawblock(XZ0260X8X2\Field49, (Int ((Float TDD0Z6BXB6\Field9) - (400.0 * menuscale))), $00, $00)
            If (((-1000.0 > XZ0260X8X2\Field2) And (-2000.0 < XZ0260X8X2\Field2)) <> 0) Then
                local2 = imagewidth(X2Z260BF0Z\Field4[$00])
                local3 = imageheight(X2Z260BF0Z\Field4[$00])
                local4 = (TDD0Z6BXB6\Field6 - (local2 Sar $01))
                local5 = (TDD0Z6BXB6\Field9 - (local3 Sar $01))
                drawblock(local4, local5, $00, $00)
                color($FF, $FF, $FF, $FF)
                setfontex(XD00026ZX2\Field0[$01])
                textex((Int ((47.0 * menuscale) + (Float ((local2 Sar $01) + local4)))), (Int ((48.0 * menuscale) + (Float local5))), getlocalstring("menu", "end"), $01, $01)
                setfontex(XD00026ZX2\Field0[$00])
                If (igm\Field2 <= $00) Then
                    local4 = (Int ((132.0 * menuscale) + (Float local4)))
                    local5 = (Int ((122.0 * menuscale) + (Float local5)))
                    local9 = $00
                    local10 = $00
                    For local7 = Each rooms
                        local11 = local7\Field22\Field21
                        If (((((((local11 <> $04) And (local11 <> $4C)) And (local11 <> $4E)) And (local11 <> $72)) And (local11 <> $6F)) And (local11 <> $70)) <> 0) Then
                            local9 = (local9 + $01)
                            local10 = (local10 + local7\Field7)
                        EndIf
                    Next
                    If (local9 = local10) Then
                        snavunlocked = $01
                    EndIf
                    local12 = $00
                    local13 = $00
                    For local6 = Each itemtemplates
                        If (local6\Field9 = $00) Then
                            local8 = (((((local6\Field19 = "Leaflet") Lor (local6\Field19 = "Drawing")) Lor (local6\Field19 = "Blank Paper")) Lor ((local6\Field19 = "Note from Maynard") And (3.0 <> (Float i_005\Field0)))) = $00)
                            If (local8 <> 0) Then
                                local12 = (local12 + $01)
                                local13 = (local13 + local6\Field6)
                            EndIf
                        EndIf
                    Next
                    If (local12 = local13) Then
                        ereaderunlocked = $01
                    EndIf
                    local14 = $01
                    local15 = _JsonGetArray(_JsonGetValue(achievementsarray, "achievements"))
                    local16 = _JsonGetArraySize(local15)
                    For local8 = $00 To (local16 - $01) Step $01
                        local17 = _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local15, local8), "id"))
                        If (_S2IMapContains(unlockedachievements, local17) <> 0) Then
                            If (_JsonGetBool(_JsonGetValue(_JsonGetArrayValue(local15, local8), "scp")) <> 0) Then
                                local14 = (local14 + $01)
                            EndIf
                        EndIf
                    Next
                    local18 = _S2IMapSize(unlockedachievements)
                    local19 = (escapetimer Mod $3C)
                    local20 = (Int floor((Float (escapetimer / $3C))))
                    local21 = (Int floor((Float (local20 / $3C))))
                    local20 = (local20 - (local21 * $3C))
                    textex(local4, local5, format(getlocalstring("menu", "end.scps"), (Str local14), "%s"), $00, $00)
                    textex(local4, (Int ((20.0 * menuscale) + (Float local5))), format(format(getlocalstring("menu", "end.achi"), (Str local18), "{0}"), (Str _S2IMapSize(achievementsindex)), "{1}"), $00, $00)
                    textex(local4, (Int ((40.0 * menuscale) + (Float local5))), format(format(getlocalstring("menu", "end.room"), (Str local10), "{0}"), (Str local9), "{1}"), $00, $00)
                    textex(local4, (Int ((60.0 * menuscale) + (Float local5))), format(format(getlocalstring("menu", "end.doc"), (Str local13), "{0}"), (Str local12), "{1}"), $00, $00)
                    textex(local4, (Int ((80.0 * menuscale) + (Float local5))), format(getlocalstring("menu", "end.914"), (Str XZ0260X8X2\Field80), "%s"), $00, $00)
                    textex(local4, (Int ((100.0 * menuscale) + (Float local5))), format(format(format(getlocalstring("menu", "end.escape"), (Str local21), "{0}"), (Str local20), "{1}"), (Str local19), "{2}"), $00, $00)
                    rendermenubuttons()
                    rendercursor()
                Else
                    rendermenu()
                EndIf
            ElseIf (-2000.0 >= XZ0260X8X2\Field2) Then
                rendercredits()
            EndIf
        EndIf
    EndIf
    setfontex(XD00026ZX2\Field0[$00])
    Return $00
End Function
