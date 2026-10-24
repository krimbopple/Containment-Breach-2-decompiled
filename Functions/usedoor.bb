Function usedoor%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local8%
    Local local9%
    Local local11.emitter
    XD8DBX4X2(d_i\Field6, selecteditem, d_i\Field12, (Int msg\Field6))
    local1 = $00
    If (selecteditem <> Null) Then
        local1 = getusingitem(selecteditem)
    EndIf
    local2 = (((((d_i\Field6\Field44 > $00) + (((d_i\Field6\Field44 > $FFFFFFFC) And (d_i\Field6\Field44 < $00)) Shl $01)) + ((d_i\Field6\Field52 <> $00) * $03)) + ((((d_i\Field6\Field46 = $05) Lor (d_i\Field6\Field46 = $04)) Lor (d_i\Field6\Field46 = $06)) Shl $02)) + ((d_i\Field6\Field46 = $01) * $05))
    local3 = $00
    d_i\Field6\Field43 = buttondirection
    If (X4BX024DX0() <> $00) Then
        d_i\Field6\Field43 = $01
        local4 = local2
        If (local4 = $05) Then
            local2 = $06
        EndIf
    EndIf
    If ((TXB2BFFFFFX() And (CB64D8DZF = Null)) <> 0) Then
        CB64D8DZF = TXXF6F02DB2[TXXDZB2ZBXX()]
    EndIf
    Select local2
        Case $01
            If (selecteditem = Null) Then
                If (350.0 > msg\Field2) Then
                    createmsg(getlocalstring("msg", "key.require"), 6.0)
                EndIf
                playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
                Return $00
            Else
                If (local1 <= $00) Then
                    If (350.0 > msg\Field2) Then
                        createmsg(getlocalstring("msg", "key.require"), 6.0)
                    EndIf
                Else
                    If (local1 = $01) Then
                        createmsg(getlocalstring("msg", "key.slot.6"), 6.0)
                    ElseIf (((d_i\Field6\Field21 = $01) Lor d_i\Field6\Field38) <> 0) Then
                        If (local1 = $09) Then
                            createmsg(getlocalstring("msg", "key.nothappend.005"), 6.0)
                        Else
                            createmsg(getlocalstring("msg", "key.nothappend"), 6.0)
                        EndIf
                    ElseIf (local1 = $09) Then
                        createmsg(getlocalstring("msg", "key.005"), 6.0)
                        If (selecteditem\Field6\Field9 = $07) Then
                            local3 = $01
                        EndIf
                    ElseIf (local1 < d_i\Field6\Field44) Then
                        If (d_i\Field6\Field44 = $09) Then
                            If (350.0 > msg\Field2) Then
                                createmsg(getlocalstring("msg", "key.required.106"), 6.0)
                            EndIf
                        Else
                            createmsg(format(getlocalstring("msg", "key.higher"), (Str (d_i\Field6\Field44 - $02)), "%s"), 6.0)
                        EndIf
                    Else
                        createmsg(getlocalstring("msg", "key.slot"), 6.0)
                    EndIf
                    selecteditem = Null
                EndIf
                If ((((d_i\Field6\Field21 <> $01) And ((((local1 > $00) And (local1 <> $01)) And (local1 >= d_i\Field6\Field44)) Lor (local1 = $09))) And (d_i\Field6\Field38 = $00)) <> 0) Then
                    playsoundex(snd_i\Field3[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field3[$00]), d_i\Field15, 10.0, 1.0)
                Else
                    If (local1 <= $00) Then
                        playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                        X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
                    Else
                        playsoundex(snd_i\Field3[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                        X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field3[$01]), d_i\Field15, 10.0, 1.0)
                    EndIf
                    Return $00
                EndIf
            EndIf
        Case $02
            If (selecteditem = Null) Then
                If (350.0 > msg\Field2) Then
                    createmsg(getlocalstring("msg", "dna.denied_1"), 6.0)
                EndIf
                playsoundex(snd_i\Field21[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$01]), d_i\Field15, 10.0, 1.0)
                Return $00
            Else
                If ((((local1 >= $00) Lor (local1 < $FFFFFFFD)) And (local1 <> $09)) <> 0) Then
                    If (350.0 > msg\Field2) Then
                        createmsg(getlocalstring("msg", "dna.denied_1"), 6.0)
                    EndIf
                Else
                    If (((d_i\Field6\Field44 <> local1) And (local1 <> $09)) <> 0) Then
                        createmsg(getlocalstring("msg", "dna.denied_2"), 6.0)
                    ElseIf (((d_i\Field6\Field21 = $01) Lor d_i\Field6\Field38) <> 0) Then
                        If (local1 = $09) Then
                            createmsg(getlocalstring("msg", "key.nothappend.005"), 6.0)
                        Else
                            createmsg(getlocalstring("msg", "dna.nothappend"), 6.0)
                        EndIf
                    ElseIf (local1 = $09) Then
                        createmsg(getlocalstring("msg", "dna.granted.005"), 6.0)
                        If (selecteditem\Field6\Field9 = $07) Then
                            local3 = $01
                        EndIf
                    Else
                        createmsg(getlocalstring("msg", "dna.granted"), 6.0)
                    EndIf
                    selecteditem = Null
                EndIf
                If ((((d_i\Field6\Field21 = $00) And ((local1 = d_i\Field6\Field44) Lor (local1 = $09))) And (d_i\Field6\Field38 = $00)) <> 0) Then
                    playsoundex(snd_i\Field21[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$00]), d_i\Field15, 10.0, 1.0)
                Else
                    playsoundex(snd_i\Field21[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$01]), d_i\Field15, 10.0, 1.0)
                    Return $00
                EndIf
            EndIf
        Case $03
            If (selecteditem = Null) Then
                If (((((d_i\Field6\Field21 = $00) And (d_i\Field6\Field52 <> $FFFFFFFF)) And (d_i\Field6\Field52 = (Int msg\Field6))) And (d_i\Field6\Field38 = $00)) <> 0) Then
                    playsoundex(snd_i\Field21[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$00]), d_i\Field15, 10.0, 1.0)
                Else
                    playsoundex(snd_i\Field21[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$01]), d_i\Field15, 10.0, 1.0)
                    Return $00
                EndIf
            Else
                If (local1 = $09) Then
                    If (((d_i\Field6\Field21 = $01) Lor d_i\Field6\Field38) <> 0) Then
                        createmsg(getlocalstring("msg", "keypad.nothappend.005"), 6.0)
                    Else
                        createmsg(getlocalstring("msg", "keypad.nothappend"), 6.0)
                    EndIf
                EndIf
                If (selecteditem\Field6\Field9 = $07) Then
                    local3 = $01
                EndIf
                selecteditem = Null
                If (((((d_i\Field6\Field21 = $00) And (d_i\Field6\Field52 <> $FFFFFFFF)) And (local1 = $09)) And (d_i\Field6\Field38 = $00)) <> 0) Then
                    playsoundex(snd_i\Field21[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$00]), d_i\Field15, 10.0, 1.0)
                Else
                    playsoundex(snd_i\Field21[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field21[$01]), d_i\Field15, 10.0, 1.0)
                    Return $00
                EndIf
            EndIf
            Select d_i\Field6\Field52
                Case code_dr_maynard
                    giveachievement("maynard", $01)
                Case code_dr_gears
                    giveachievement("gears", $01)
                Case $1E88
                    giveachievement("harp", $01)
                Case T20200F42ZD
                    giveachievement("cmr", $01)
            End Select
        Case $04
            If (d_i\Field6\Field21 > $00) Then
                If (selecteditem = Null) Then
                    If (350.0 > msg\Field2) Then
                        createmsg(getlocalstring("msg", "wood.wontbudge"), 6.0)
                    EndIf
                    If (((d_i\Field6\Field46 = $04) Lor (d_i\Field6\Field46 = $06)) <> 0) Then
                        playsoundex(snd_i\Field0[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                        X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field0[$00]), d_i\Field15, 10.0, 1.0)
                        setanimtime(d_i\Field6\Field0, 1.0, $00)
                        d_i\Field6\Field20 = $01
                    Else
                        playsoundex(snd_i\Field0[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                        X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field0[$01]), d_i\Field15, 10.0, 1.0)
                    EndIf
                Else
                    If (((local1 > $FFFFFFFC) And (local1 <> $09)) <> 0) Then
                        If (350.0 > msg\Field2) Then
                            createmsg(getlocalstring("msg", "wood.wontbudge"), 6.0)
                        EndIf
                    Else
                        If (d_i\Field6\Field21 = $02) Then
                            If (local1 <> $09) Then
                                createmsg(getlocalstring("msg", "wood.not.fit"), 6.0)
                            Else
                                createmsg(getlocalstring("msg", "wood.nothappend.005"), 6.0)
                            EndIf
                        ElseIf (((local1 <> d_i\Field6\Field44) And (local1 <> $09)) <> 0) Then
                            createmsg(getlocalstring("msg", "wood.not.fit"), 6.0)
                        Else
                            createmsg(getlocalstring("msg", "wood.unlock"), 6.0)
                            If (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
                                giveachievement("860", $01)
                                If (selecteditem\Field6\Field9 = $1D) Then
                                    If (forest_event\Field19\Field32[$00] <> Null) Then
                                        removenpc(forest_event\Field19\Field32[$00])
                                    EndIf
                                ElseIf (forest_event\Field19\Field32[$00] = Null) Then
                                    forest_event\Field19\Field32[$00] = createnpc($0C, 0.0, 0.0, 0.0)
                                EndIf
                                If (((CB64D8DZF <> Null) And (CB64D8DZF <> TXXF6F02DB2[TXXDZB2ZBXX()])) <> 0) Then
                                    Return $00
                                EndIf
                                createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                                createconsolemsg(getlocalstring("misc", "warning2"), $FF, $00, $00, $00)
                                createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                            EndIf
                            d_i\Field6\Field21 = $00
                        EndIf
                        selecteditem = Null
                    EndIf
                    If (((local1 > $FFFFFFFC) And (local1 <> $09)) <> 0) Then
                        If (((d_i\Field6\Field46 = $04) Lor (d_i\Field6\Field46 = $06)) <> 0) Then
                            playsoundex(snd_i\Field0[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                            X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field0[$00]), d_i\Field15, 10.0, 1.0)
                            setanimtime(d_i\Field6\Field0, 1.0, $00)
                            d_i\Field6\Field20 = $01
                        Else
                            playsoundex(snd_i\Field0[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                            X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field0[$01]), d_i\Field15, 10.0, 1.0)
                        EndIf
                    Else
                        playsoundex(snd_i\Field38, camera, d_i\Field15, 10.0, 1.0, $00, $00)
                        X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field38), d_i\Field15, 10.0, 1.0)
                    EndIf
                EndIf
                Return $00
            ElseIf (((d_i\Field6\Field46 = $04) Lor (d_i\Field6\Field46 = $06)) <> 0) Then
                playsoundex(snd_i\Field0[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field0[$00]), d_i\Field15, 10.0, 1.0)
                setanimtime(d_i\Field6\Field0, 1.0, $00)
                d_i\Field6\Field20 = $01
            EndIf
        Case $05
            If (d_i\Field6\Field21 = $01) Then
                If ((d_i\Field6\Field19 > $00) = $00) Then
                    createmsg(getlocalstring("msg", "elev.broken"), 6.0)
                    playsoundex(buttonsfx[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$01]), d_i\Field15, 10.0, 1.0)
                    setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                    d_i\Field6\Field49 = d_i\Field12
                    Return $00
                Else
                    If (d_i\Field6\Field19 = $01) Then
                        createmsg(getlocalstring("msg", "elev.called"), 6.0)
                    ElseIf (d_i\Field6\Field19 = $03) Then
                        createmsg(getlocalstring("msg", "elev.floor"), 6.0)
                    ElseIf (msg\Field0 <> getlocalstring("msg", "elev.called")) Then
                        Select rand($0A, $01)
                            Case $01
                                createmsg(getlocalstring("msg", "elev.stop"), 6.0)
                            Case $02
                                createmsg(getlocalstring("msg", "elev.faster"), 6.0)
                            Case $03
                                createmsg(getlocalstring("msg", "elev.mav"), 6.0)
                            Default
                                createmsg(getlocalstring("msg", "elev.already"), 6.0)
                        End Select
                    Else
                        createmsg(getlocalstring("msg", "elev.already"), 6.0)
                    EndIf
                    playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                    X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
                    setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                    d_i\Field6\Field49 = d_i\Field12
                    Return $00
                EndIf
            Else
                playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
                setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                d_i\Field6\Field49 = d_i\Field12
            EndIf
        Case $06
            If ((((d_i\Field6\Field35 = Null) Lor (d_i\Field6\Field21 = $01)) Lor ((d_i\Field6\Field35 <> Null) And (d_i\Field6\Field35\Field21 = $01))) <> 0) Then
                createmsg(getlocalstring("msg", "elev.broken"), 6.0)
                playsoundex(buttonsfx[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$01]), d_i\Field15, 10.0, 1.0)
                d_i\Field6\Field43 = $01
                setanimtime(d_i\Field15, 1.0, $00)
                d_i\Field6\Field49 = d_i\Field12
                Return $00
            EndIf
            local8 = isinsideelevator(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), d_i\Field6\Field31)
            local9 = $00
            playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
            X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
            If (((d_i\Field6\Field39 = $00) And (0.0 = d_i\Field6\Field13)) <> 0) Then
                If (((d_i\Field6\Field35\Field39 And (180.0 = d_i\Field6\Field35\Field13)) And (0.0 >= d_i\Field6\Field35\Field25)) <> 0) Then
                    openclosedoor(d_i\Field6\Field35, $01, $00)
                    d_i\Field6\Field35\Field12 = $01
                    d_i\Field6\Field35\Field43 = (d_i\Field6\Field35\Field1 = $01)
                    d_i\Field6\Field43 = d_i\Field6\Field35\Field43
                    updateelevatorpanel(d_i\Field6)
                    updateelevatorpanel(d_i\Field6\Field35)
                    local9 = $01
                EndIf
                setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                d_i\Field6\Field49 = d_i\Field12
                If (local9 = $01) Then
                    createmsg(getlocalstring("msg", "elev.called"), 6.0)
                ElseIf (msg\Field0 <> getlocalstring("msg", "elev.called")) Then
                    Select rand($0A, $01)
                        Case $01
                            createmsg(getlocalstring("msg", "elev.stop"), 6.0)
                        Case $02
                            createmsg(getlocalstring("msg", "elev.faster"), 6.0)
                        Case $03
                            createmsg(getlocalstring("msg", "elev.mav"), 6.0)
                        Default
                            createmsg(getlocalstring("msg", "elev.already"), 6.0)
                    End Select
                Else
                    createmsg(getlocalstring("msg", "elev.already"), 6.0)
                EndIf
                Return $00
            ElseIf ((d_i\Field6\Field39 And (180.0 = d_i\Field6\Field13)) <> 0) Then
                If (local8 <> 0) Then
                    d_i\Field6\Field43 = (d_i\Field6\Field1 = $01)
                    d_i\Field6\Field12 = $01
                    setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                    d_i\Field6\Field49 = d_i\Field12
                    d_i\Field6\Field35\Field39 = $01
                    openclosedoor(d_i\Field6\Field35, $01, $00)
                    d_i\Field6\Field35\Field43 = d_i\Field6\Field43
                    updateelevatorpanel(d_i\Field6)
                    updateelevatorpanel(d_i\Field6\Field35)
                Else
                    d_i\Field6\Field43 = $01
                    setanimtime(d_i\Field15, 1.0, $00)
                    d_i\Field6\Field49 = d_i\Field12
                    createmsg(getlocalstring("msg", "elev.floor"), 6.0)
                    Return $00
                EndIf
            ElseIf (((((((d_i\Field6\Field39 = $00) And (0.0 = d_i\Field6\Field13)) And (d_i\Field6\Field35\Field39 = $00)) And (0.0 = d_i\Field6\Field35\Field13)) And (d_i\Field6\Field12 = $00)) And (d_i\Field6\Field35\Field12 = $00)) <> 0) Then
                d_i\Field6\Field43 = $01
                setanimtime(d_i\Field15, 1.0, $00)
                d_i\Field6\Field49 = d_i\Field12
            Else
                Return $00
            EndIf
        Default
            If (((d_i\Field6\Field21 = $01) Lor d_i\Field6\Field38) <> 0) Then
                If (d_i\Field6\Field39 <> 0) Then
                    createmsg(getlocalstring("msg", "button.nothappend"), 6.0)
                Else
                    createmsg(getlocalstring("msg", "button.locked"), 6.0)
                EndIf
                playsoundex(buttonsfx[$01], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$01]), d_i\Field15, 10.0, 1.0)
                If (animlength(d_i\Field15) >= $00) Then
                    setanimtime(d_i\Field15, 1.0, $00)
                    d_i\Field6\Field49 = d_i\Field12
                EndIf
                Return $00
            Else
                playsoundex(buttonsfx[$00], camera, d_i\Field15, 10.0, 1.0, $00, $00)
                X42666Z0B0(CB64D8DZF, XX0D06202F(buttonsfx[$00]), d_i\Field15, 10.0, 1.0)
                If (animlength(d_i\Field15) >= $00) Then
                    setanimtime(d_i\Field15, (((Float (d_i\Field6\Field43 = $00)) * 20.0) + 1.0), $00)
                    d_i\Field6\Field49 = d_i\Field12
                EndIf
            EndIf
    End Select
    openclosedoor(d_i\Field6, arg0, $00)
    If (local3 <> 0) Then
        d_i\Field6\Field27 = $01
        If ((d_i\Field6\Field39 And (d_i\Field6\Field26 = Null)) <> 0) Then
            d_i\Field6\Field21 = $01
        EndIf
        XZ0260X8X2\Field14 = 3.0
        local11 = setemitter(Null, entityx(d_i\Field6\Field0, $01, 1.0), entityy(d_i\Field6\Field0, $01, 1.0), entityz(d_i\Field6\Field0, $01, 1.0), $10)
        entityparent(local11\Field2, d_i\Field6\Field0, $01)
        playsoundex(snd_i\Field53, camera, d_i\Field6\Field51, 10.0, 1.0, $00, $00)
        X42666Z0B0(CB64D8DZF, XX0D06202F(snd_i\Field53), d_i\Field6\Field51, 10.0, 1.0)
    EndIf
    CB64D8DZF = Null
    Return $00
End Function
