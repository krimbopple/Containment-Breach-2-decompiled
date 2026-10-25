Function updategui%()
    Local local0.events
    Local local1.items
    Local local2.rooms
    Local local3.npcs
    Local local4.itemtemplates
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11#
    Local local12#
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18$
    Local local20%
    Local local21%
    Local local22%
    Local local23%
    Local local24#
    Local local25#
    Local local26#
    Local local27#
    Local local29%
    Local local30%
    Local local31%
    Local local32%
    Local local33%
    Local local34%
    Local local35%
    Local local36.items
    Local local37%
    Local local38%
    Local local39%
    Local local41.items
    Local local42%
    Local local43%
    Local local57%
    Local local72%
    Local local73.T24B4ZF6F6
    Local local76%
    Local local77%
    Local local87.items
    Local local89%
    Local local90%
    Local local91%
    catcherrors("UpdateGUI()")
    If (((pd_event <> Null) And (pd_event\Field19 = playerroom)) <> 0) Then
        If ((((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) And (5.0 <> pd_event\Field7)) <> 0) Then
            If (pd_event\Field16 <> $00) Then
                StopChannel(pd_event\Field2)
                pd_event\Field2 = $00
                freeimage(pd_event\Field16)
                pd_event\Field16 = $00
            EndIf
            If (pd_event\Field29 = $00) Then
                StopChannel(pd_event\Field2)
                pd_event\Field2 = $00
                Select rand($05, $01)
                    Case $01
                        playsound_strict(snd_i\Field40[$01], $00, $00)
                    Case $02
                        playsound_strict(snd_i\Field40[$02], $00, $00)
                    Case $03
                        playsound_strict(snd_i\Field40[$09], $00, $00)
                    Case $04
                        playsound_strict(snd_i\Field40[$0A], $00, $00)
                    Case $05
                        playsound_strict(snd_i\Field40[$0C], $00, $00)
                End Select
                pd_event\Field29 = scaleimageex(loadimage_strict("GFX\Overlays\scp_106_face_overlay.png"), menuscale, menuscale, $01)
            Else
                T8660BZ460\Field5 = $01
                If (rand($1E, $01) = $01) Then
                    If (ChannelPlaying(pd_event\Field2) = $00) Then
                        pd_event\Field2 = playsound_strict(snd_i\Field44[rand($00, $03)], $00, $00)
                    EndIf
                EndIf
            EndIf
        Else
            If (pd_event\Field29 <> $00) Then
                StopChannel(pd_event\Field2)
                pd_event\Field2 = $00
                freeimage(pd_event\Field29)
                pd_event\Field29 = $00
            EndIf
            If (2.0 = pd_event\Field7) Then
                If (((-16.0 < XZ0260X8X2\Field53) And (-6.0 > XZ0260X8X2\Field53)) <> 0) Then
                    If (pd_event\Field16 = $00) Then
                        StopChannel(pd_event\Field2)
                        pd_event\Field2 = $00
                        playsound_strict(pd_event\Field30, $01, $00)
                        pd_event\Field16 = scaleimageex(loadimage_strict("GFX\Overlays\kneel_mortal_overlay.png"), menuscale, menuscale, $01)
                    ElseIf (ChannelPlaying(pd_event\Field2) = $00) Then
                        pd_event\Field2 = playsound_strict(pd_event\Field0, $01, $00)
                    EndIf
                ElseIf (ChannelPlaying(pd_event\Field2) <> 0) Then
                    StopChannel(pd_event\Field2)
                    pd_event\Field2 = $00
                    pd_event\Field2 = $00
                EndIf
            ElseIf (pd_event\Field16 <> $00) Then
                freeimage(pd_event\Field16)
                pd_event\Field16 = $00
                StopChannel(pd_event\Field2)
                pd_event\Field2 = $00
            EndIf
        EndIf
    EndIf
    If (handentity <> $00) Then
        d_i\Field15 = $00
        d_i\Field6 = Null
    EndIf
    If ((((menuopen Lor (Int XZ0260X8X2\Field48)) Lor consoleopen) Lor TX6X48DXXDX) = $00) Then
        If ((i_294\Field4 And (0.1 < secondarylighton)) <> 0) Then
            update294()
        EndIf
        If (((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) = $00) Then
            If (d_i\Field15 <> $00) Then
                If (XZ0260X8X2\Field54 <> 0) Then
                    XZ0260X8X2\Field54 = $00
                    If (d_i\Field6 <> Null) Then
                        If (d_i\Field6\Field52 <> $00) Then
                            d_i\Field3 = d_i\Field6
                        ElseIf (XZ0260X8X2\Field38 = $02) Then
                            local20 = GUESSEDupdateevents_2()
                            usedoor($01)
                            GUESSEDupdateevents(local20)
                        EndIf
                    EndIf
                EndIf
            EndIf
        EndIf
        If (((selectedscreen <> Null) And (TDD0Z6BXB6\Field12 Lor keyhit($01))) <> 0) Then
            freeimage(selectedscreen\Field3)
            selectedscreen\Field3 = $00
            TDD0Z6BXB6\Field12 = $00
            selectedscreen = Null
        EndIf
    EndIf
    local21 = invopen
    local22 = $42
    local23 = $01
    If (d_i\Field3 <> Null) Then
        If (selecteditem <> Null) Then
            If ((((selecteditem\Field6\Field9 = $06) Lor (selecteditem\Field6\Field9 = $07)) Lor (selecteditem\Field6\Field9 = $08)) <> 0) Then
                usedoor($01)
                local23 = $00
            Else
                selecteditem = Null
            EndIf
        EndIf
        If ((local23 And (d_i\Field15 <> $00)) <> 0) Then
            local24 = entityx(d_i\Field15, $01, 1.0)
            local25 = entityy(d_i\Field15, $01, 1.0)
            local26 = entityz(d_i\Field15, $01, 1.0)
            camerazoom(camera, (min(((XZ0260X8X2\Field51 / 400.0) + 1.0), 1.1) / camerazoomvalue))
            local13 = createpivot($00)
            positionentity(local13, local24, local25, local26, $00)
            rotateentity(local13, 0.0, (entityyaw(d_i\Field15, $01, 1.0) - 180.0), 0.0, $00)
            moveentity(local13, 0.0, 0.0, 0.22, $00)
            positionentity(camera, entityx(local13, $00, 1.0), entityy(local13, $00, 1.0), entityz(local13, $00, 1.0), $00)
            pointentity(camera, d_i\Field15, 0.0)
            freeentity(local13)
            local13 = $00
            local12 = (meshheight(d_i\Field8[$00]) * 0.015)
            cameraproject(camera, local24, (local25 + local12), local26, $01)
            local11 = projectedy()
            cameraproject(camera, local24, (local25 - local12), local26, $01)
            local12 = ((projectedy() - local11) / (462.0 * menuscale))
            local27 = (local12 / 2.0)
            local6 = (Int ((Float TDD0Z6BXB6\Field6) - ((Float imagewidth(X2Z260BF0Z\Field4[$04])) * local27)))
            local7 = (Int ((Float TDD0Z6BXB6\Field9) - ((Float imageheight(X2Z260BF0Z\Field4[$04])) * local27)))
            If (msg\Field7 <> "") Then
                msg\Field5 = (msg\Field5 - fps\Field3[$00])
                If (0.0 >= msg\Field5) Then
                    msg\Field7 = ""
                    d_i\Field3 = Null
                    stopmousemovement()
                EndIf
            EndIf
            If (menuopen = $00) Then
                local6 = (Int (((44.0 * menuscale) * local12) + (Float local6)))
                local7 = (Int (((249.0 * menuscale) * local12) + (Float local7)))
                For local15 = $00 To $03 Step $01
                    For local9 = $00 To $02 Step $01
                        local16 = ((Int (((58.5 * menuscale) * local12) * (Float local15))) + local6)
                        local17 = (Int ((((67.0 * menuscale) * local12) * (Float local9)) + (Float local7)))
                        local5 = $00
                        If ((mouseon(local16, local17, (Int ((54.0 * menuscale) * local12)), (Int ((65.0 * menuscale) * local12))) And (msg\Field7 = "")) <> 0) Then
                            If (TDD0Z6BXB6\Field3 <> 0) Then
                                playsound_strict(buttonsfx[$00], $00, $00)
                                Select ((local15 + $01) + (local9 Shl $02))
                                    Case $01,$02,$03
                                        msg\Field6 = (msg\Field6 + (Str ((local15 + $01) + (local9 Shl $02))))
                                    Case $04
                                        msg\Field6 = (msg\Field6 + "0")
                                    Case $05,$06,$07
                                        msg\Field6 = (msg\Field6 + (Str (((local15 + $01) + (local9 Shl $02)) - $01)))
                                    Case $08
                                        usedoor($01)
                                        If ((Int msg\Field6) = d_i\Field3\Field52) Then
                                            d_i\Field3 = Null
                                            stopmousemovement()
                                        Else
                                            msg\Field7 = getlocalstring("msg", "denied")
                                            msg\Field5 = 210.0
                                            msg\Field6 = ""
                                        EndIf
                                    Case $09,$0A,$0B
                                        msg\Field6 = (msg\Field6 + (Str (((local15 + $01) + (local9 Shl $02)) - $02)))
                                    Case $0C
                                        msg\Field6 = ""
                                End Select
                                If (len(msg\Field6) > $04) Then
                                    msg\Field6 = left(msg\Field6, $04)
                                EndIf
                            EndIf
                        Else
                            local5 = $00
                        EndIf
                    Next
                Next
                If (TDD0Z6BXB6\Field12 <> 0) Then
                    d_i\Field3 = Null
                    stopmousemovement()
                EndIf
            EndIf
        Else
            d_i\Field3 = Null
        EndIf
    Else
        msg\Field6 = ""
        msg\Field5 = 0.0
        msg\Field7 = ""
    EndIf
    updatebatterytimer()
    isusingradio = $00
    local31 = (Int (70.0 * menuscale))
    local32 = (Int (35.0 * menuscale))
    local33 = (maxitemamount Sar $01)
    If (otheropen <> Null) Then
        invopen = $00
        d_i\Field3 = Null
        local34 = $00
        local6 = (TDD0Z6BXB6\Field6 - ((((local31 * $0A) Sar $01) + (local32 Shl $02)) Sar $01))
        local7 = ((TDD0Z6BXB6\Field9 - ((((otheropen\Field36 / $0A) Shl $01) - $01) * local31)) - local32)
        local29 = $FFFFFFFF
        For local15 = $00 To (otheropen\Field36 - $01) Step $01
            If (mouseon(local6, local7, local31, local31) <> 0) Then
                local29 = local15
            EndIf
            If (local29 = local15) Then
                local22 = local15
            EndIf
            If (((otheropen\Field8[local15] <> Null) And (selecteditem <> otheropen\Field8[local15])) <> 0) Then
                If (local29 = local15) Then
                    If (selecteditem = Null) Then
                        If (TDD0Z6BXB6\Field7 <> 0) Then
                            selecteditem = otheropen\Field8[local15]
                            If ((TDD0Z6BXB6\Field0 And (TDD0Z6BXB6\Field15 = local15)) <> 0) Then
                                If (((((selecteditem\Field6\Field9 = $19) Lor (selecteditem\Field6\Field9 = $18)) Lor (selecteditem\Field6\Field9 = $1A)) Lor (selecteditem\Field6\Field9 = $1B)) <> 0) Then
                                    createmsg(getlocalstring("msg", "wallet.714"), 6.0)
                                    selecteditem = Null
                                    Exit
                                EndIf
                                If (otheropen\Field8[local15]\Field6\Field5 <> $42) Then
                                    playsound_strict(snd_i\Field46[otheropen\Field8[local15]\Field6\Field5], $00, $00)
                                EndIf
                                otheropen = Null
                                local30 = $01
                                invopen = $00
                                TDD0Z6BXB6\Field0 = $00
                                DZ64X028\Field29 = 20.0
                                GUESSEDupdatetxbfb(selecteditem)
                                Exit
                            EndIf
                        EndIf
                    EndIf
                EndIf
            ElseIf (((local29 = local15) And TDD0Z6BXB6\Field7) <> 0) Then
                For local8 = $00 To (otheropen\Field36 - $01) Step $01
                    If (otheropen\Field8[local8] = selecteditem) Then
                        otheropen\Field8[local8] = Null
                        Exit
                    EndIf
                Next
                otheropen\Field8[local15] = selecteditem
                selecteditem = Null
            EndIf
            local6 = ((local6 + local31) + local32)
            local34 = (local34 + $01)
            If (local34 = $05) Then
                local34 = $00
                local7 = (local7 + (local31 Shl $01))
                local6 = (TDD0Z6BXB6\Field6 - ((((local31 * $0A) Sar $01) + (local32 Shl $02)) Sar $01))
            EndIf
        Next
        If (TDD0Z6BXB6\Field7 <> 0) Then
            TDD0Z6BXB6\Field15 = local29
        EndIf
        If (selecteditem <> Null) Then
            If (((TDD0Z6BXB6\Field1 = $00) Lor TDD0Z6BXB6\Field12) <> 0) Then
                If (local22 = $42) Then
                    dropitem(selecteditem, $01)
                    nullsecondinv(otheropen)
                    selecteditem = Null
                    If (TDD0Z6BXB6\Field12 = $00) Then
                        otheropen = Null
                        local30 = $01
                        movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
                    EndIf
                ElseIf (otheropen\Field8[local22] = Null) Then
                    For local8 = $00 To (otheropen\Field36 - $01) Step $01
                        If (otheropen\Field8[local8] = selecteditem) Then
                            otheropen\Field8[local8] = Null
                            Exit
                        EndIf
                    Next
                    otheropen\Field8[local22] = selecteditem
                    selecteditem = Null
                ElseIf (otheropen\Field8[local22] <> selecteditem) Then
                    swapotheropenitem(selecteditem, otheropen\Field8[local22])
                EndIf
                selecteditem = Null
            EndIf
        EndIf
        If ((local30 And (invopen = $00)) <> 0) Then
            otheropen = Null
            stopmousemovement()
        EndIf
    ElseIf (invopen <> 0) Then
        shoulddeletegadgets = $01
        d_i\Field3 = Null
        local6 = (TDD0Z6BXB6\Field6 - (((local31 * local33) + ((local33 - $01) * local32)) Sar $01))
        local7 = ((TDD0Z6BXB6\Field9 - local31) - local32)
        If (maxitemamount = $02) Then
            local7 = (local7 + local31)
            local6 = (local6 - (((local31 * local33) + local32) Sar $01))
        EndIf
        local29 = $FFFFFFFF
        local35 = $00
        For local15 = $00 To (maxitemamount - $01) Step $01
            If (mouseon(local6, local7, local31, local31) <> 0) Then
                local29 = local15
            EndIf
            If (local29 = local15) Then
                local22 = local15
            EndIf
            If (((TX60DB8XBBZ(local15) <> Null) And (selecteditem <> TX60DB8XBBZ(local15))) <> 0) Then
                If (local29 = local15) Then
                    If (selecteditem = Null) Then
                        If (TDD0Z6BXB6\Field7 <> 0) Then
                            selecteditem = TX60DB8XBBZ(local15)
                            If ((TDD0Z6BXB6\Field0 And (TDD0Z6BXB6\Field15 = local15)) <> 0) Then
                                If (TX60DB8XBBZ(local15)\Field6\Field5 <> $42) Then
                                    playsound_strict(snd_i\Field46[TX60DB8XBBZ(local15)\Field6\Field5], $00, $00)
                                EndIf
                                invopen = $00
                                TDD0Z6BXB6\Field0 = $00
                                DZ64X028\Field29 = 20.0
                                GUESSEDupdatetxbfb(selecteditem)
                                Exit
                            EndIf
                        EndIf
                    EndIf
                EndIf
            ElseIf (((local29 = local15) And TDD0Z6BXB6\Field7) <> 0) Then
                For local8 = $00 To (maxitemamount - $01) Step $01
                    If (TX60DB8XBBZ(local8) = selecteditem) Then
                        TX60DB8XBBZ(local8) = Null
                        Exit
                    EndIf
                Next
                TX60DB8XBBZ(local15) = selecteditem
                selecteditem = Null
            EndIf
            local6 = ((local6 + local31) + local32)
            If (((maxitemamount >= $04) And (local15 = (local33 - $01))) <> 0) Then
                local7 = (local7 + (local31 Shl $01))
                local6 = (TDD0Z6BXB6\Field6 - (((local31 * local33) + ((local33 - $01) * local32)) Sar $01))
            EndIf
        Next
        If (TDD0Z6BXB6\Field7 <> 0) Then
            TDD0Z6BXB6\Field15 = local29
        EndIf
        If (selecteditem <> Null) Then
            local36 = Null
            For local8 = $00 To (maxitemamount - $01) Step $01
                If (TX60DB8XBBZ(local8) <> Null) Then
                    If (TX60DB8XBBZ(local8)\Field36 > $00) Then
                        local37 = $00
                        For local38 = $00 To (TX60DB8XBBZ(local8)\Field36 - $01) Step $01
                            If (TX60DB8XBBZ(local8)\Field8[local38] = selecteditem) Then
                                local36 = TX60DB8XBBZ(local8)
                                Exit
                            EndIf
                        Next
                    EndIf
                EndIf
            Next
            If (((TDD0Z6BXB6\Field1 = $00) Lor TDD0Z6BXB6\Field12) <> 0) Then
                If (local22 = $42) Then
                    Select selecteditem\Field6\Field9
                        Case $27,$28,$3C,$3D,$3E,$3F
                            local39 = (GUESSEDupdatexdb() = $00)
                        Case $38
                            local39 = (T8660BZ460\Field3 = $01)
                        Case $39
                            local39 = (T8660BZ460\Field3 = $02)
                        Case $7E
                            local39 = (T8660BZ460\Field4 = $01)
                        Case $3A
                            local39 = (T8660BZ460\Field3 = $03)
                        Case $3B
                            local39 = (T8660BZ460\Field3 = $04)
                        Case $22
                            local39 = (i_1499\Field8 = $01)
                        Case $23
                            local39 = (i_1499\Field8 = $02)
                        Case $40
                            local39 = (T8660BZ460\Field8 = $01)
                        Case $41
                            local39 = (T8660BZ460\Field8 = $02)
                        Case $42
                            local39 = (T8660BZ460\Field8 = $03)
                        Case $43
                            local39 = (T8660BZ460\Field11 = $01)
                        Case $44
                            local39 = (T8660BZ460\Field11 = $02)
                        Case $26
                            local39 = (T8660BZ460\Field7 = $01)
                        Case $74
                            local39 = (T8660BZ460\Field7 = $02)
                        Case $0B
                            local39 = (i_268\Field2 = $01)
                        Case $0C
                            local39 = (i_268\Field2 = $02)
                        Case $0D
                            local39 = (i_268\Field2 = $03)
                        Case $19
                            local39 = (i_714\Field0 = $02)
                        Case $18
                            local39 = (i_714\Field0 = $01)
                        Case $12
                            local39 = i_427\Field2
                        Default
                            local39 = $00
                    End Select
                    If (local39 <> 0) Then
                        For local8 = $00 To (maxitemamount - $01) Step $01
                            If (((TX60DB8XBBZ(local8) <> Null) And (TX60DB8XBBZ(local8) <> selecteditem)) <> 0) Then
                                If (TX60DB8XBBZ(local8)\Field6\Field9 = selecteditem\Field6\Field9) Then
                                    local39 = $00
                                    Exit
                                EndIf
                                If (TX60DB8XBBZ(local8)\Field36 > $00) Then
                                    For local38 = $00 To (TX60DB8XBBZ(local8)\Field36 - $01) Step $01
                                        If ((((TX60DB8XBBZ(local8)\Field8[local38] <> Null) And (TX60DB8XBBZ(local8)\Field8[local38]\Field6\Field9 = selecteditem\Field6\Field9)) And (TX60DB8XBBZ(local8)\Field8[local38] <> selecteditem)) <> 0) Then
                                            local39 = $00
                                            local8 = maxitemamount
                                            Exit
                                        EndIf
                                    Next
                                EndIf
                            EndIf
                        Next
                    EndIf
                    If (local39 <> 0) Then
                        createhintmsg(getlocalstring("msg", "takeoff"), 6.0, $00)
                    Else
                        If (local36 <> Null) Then
                            nullsecondinv(local36)
                        EndIf
                        dropitem(selecteditem, $01)
                        invopen = TDD0Z6BXB6\Field12
                    EndIf
                    If (TDD0Z6BXB6\Field12 = $00) Then
                        movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
                        stopmousemovement()
                    EndIf
                ElseIf (TX60DB8XBBZ(local22) = Null) Then
                    For local8 = $00 To (maxitemamount - $01) Step $01
                        If (TX60DB8XBBZ(local8) = selecteditem) Then
                            TX60DB8XBBZ(local8) = Null
                            Exit
                        EndIf
                    Next
                    If (local36 <> Null) Then
                        nullsecondinv(local36)
                    EndIf
                    TX60DB8XBBZ(local22) = selecteditem
                    selecteditem = Null
                ElseIf (TX60DB8XBBZ(local22) <> selecteditem) Then
                    C20FB8DZF = TX60DB8XBBZ(local22)
                    local41 = Null
                    If (TX60DB8XBBZ(local22)\Field6\Field9 = $7C) Then
                        local41 = Null
                        Select selecteditem\Field6\Field9
                            Case $2E,$2D,$13,$7C
                                If (local36 <> Null) Then
                                    createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                    selecteditem = Null
                                Else
                                    swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                EndIf
                            Default
                                For local42 = $00 To (TX60DB8XBBZ(local22)\Field36 - $01) Step $01
                                    If (TX60DB8XBBZ(local22)\Field8[local42] = Null) Then
                                        If (selecteditem <> Null) Then
                                            GUESSEDsetnullsecondinv(selecteditem, TX60DB8XBBZ(local22))
                                            TX60DB8XBBZ(local22)\Field8[local42] = selecteditem
                                            For local43 = $00 To (maxitemamount - $01) Step $01
                                                If (TX60DB8XBBZ(local43) = selecteditem) Then
                                                    TX60DB8XBBZ(local43) = Null
                                                    playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                                    Exit
                                                EndIf
                                            Next
                                            local41 = selecteditem
                                            selecteditem = Null
                                            Exit
                                        EndIf
                                    EndIf
                                Next
                        End Select
                        If (selecteditem <> Null) Then
                            createmsg(getlocalstring("mpmsg", "backpack.full"), 6.0)
                        Else
                            createmsg(format(getlocalstring("mpmsg", "backpack.add"), local41\Field6\Field24, "%s"), 6.0)
                        EndIf
                    Else
                        Select selecteditem\Field6\Field9
                            Case $00,$01,$02,$59,$5A,$5B,$5C,$5D,$5E,$5F,$60,$63,$61,$62,$03,$04,$05,$6A,$6B,$68,$67,$69,$1C,$1D,$19,$18,$1A,$1B,$14,$15,$16,$25,$75
                                If ((((0.0 < TX60DB8XBBZ(local22)\Field15) And ((TX60DB8XBBZ(local22)\Field6\Field9 = $4D) Lor (TX60DB8XBBZ(local22)\Field6\Field9 = $4E))) Lor (TX60DB8XBBZ(local22)\Field6\Field9 = $4F)) <> 0) Then
                                    Select selecteditem\Field6\Field9
                                        Case $00,$01
                                            If (((((((selecteditem\Field6\Field19 = "Leaflet") Lor (selecteditem\Field6\Field19 = "Drawing")) Lor (selecteditem\Field6\Field19 = "Note from Maynard")) Lor (selecteditem\Field6\Field19 = "SCP-085")) Lor (selecteditem\Field6\Field19 = "Newspaper")) Lor (selecteditem\Field6\Field9 = $01)) <> 0) Then
                                                createmsg(getlocalstring("msg", "e.reader.scan.fail"), 6.0)
                                                playsound_strict(snd_i\Field21[$01], $00, $00)
                                                selecteditem = Null
                                                Return $00
                                            EndIf
                                            For local9 = $01 To $62 Step $01
                                                If (TX60DB8XBBZ(local22)\Field0[local9] = selecteditem\Field6) Then
                                                    createmsg(getlocalstring("msg", "e.reader.scan.already"), 6.0)
                                                    playsound_strict(snd_i\Field21[$01], $00, $00)
                                                    selecteditem = Null
                                                    Return $00
                                                EndIf
                                            Next
                                            TX60DB8XBBZ(local22)\Field32 = (TX60DB8XBBZ(local22)\Field32 + $01)
                                            TX60DB8XBBZ(local22)\Field0[TX60DB8XBBZ(local22)\Field32] = selecteditem\Field6
                                            createmsg(getlocalstring("msg", "e.reader.scan.succ"), 6.0)
                                            playsound_strict(snd_i\Field21[$00], $00, $00)
                                            selecteditem = Null
                                        Default
                                            If (local36 <> Null) Then
                                                createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                                selecteditem = Null
                                            Else
                                                swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                            EndIf
                                    End Select
                                ElseIf (TX60DB8XBBZ(local22)\Field6\Field9 = $2D) Then
                                    local41 = Null
                                    Select selecteditem\Field6\Field9
                                        Case $00,$01,$02,$59,$5A,$5B,$5C,$5D,$5E,$5F,$60,$63,$61,$62,$03,$04,$05,$75
                                            If (local36 <> TX60DB8XBBZ(local22)) Then
                                                If (local36 <> Null) Then
                                                    nullsecondinv(local36)
                                                EndIf
                                                For local42 = $00 To (TX60DB8XBBZ(local22)\Field36 - $01) Step $01
                                                    If (TX60DB8XBBZ(local22)\Field8[local42] = Null) Then
                                                        If (selecteditem <> Null) Then
                                                            GUESSEDsetnullsecondinv(selecteditem, TX60DB8XBBZ(local22))
                                                            TX60DB8XBBZ(local22)\Field8[local42] = selecteditem
                                                            TX60DB8XBBZ(local22)\Field20 = TX60DB8XBBZ(local22)\Field6\Field14
                                                            For local43 = $00 To (maxitemamount - $01) Step $01
                                                                If (TX60DB8XBBZ(local43) = selecteditem) Then
                                                                    TX60DB8XBBZ(local43) = Null
                                                                    playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                                                    Exit
                                                                EndIf
                                                            Next
                                                            local41 = selecteditem
                                                            selecteditem = Null
                                                            Exit
                                                        EndIf
                                                    EndIf
                                                Next
                                                If (selecteditem <> Null) Then
                                                    createmsg(getlocalstring("msg", "clipboard.full"), 6.0)
                                                ElseIf (((local41\Field6\Field9 = $00) Lor (local41\Field6\Field9 = $01)) <> 0) Then
                                                    createmsg(getlocalstring("msg", "clipboard.paper"), 6.0)
                                                ElseIf (((local41\Field6\Field9 = $03) Lor (local41\Field6\Field9 = $04)) <> 0) Then
                                                    createmsg(format(getlocalstring("msg", "clipboard.badge"), local41\Field6\Field24, "%s"), 6.0)
                                                Else
                                                    createmsg(format(getlocalstring("msg", "clipboard.add"), local41\Field6\Field24, "%s"), 6.0)
                                                EndIf
                                            Else
                                                selecteditem = Null
                                            EndIf
                                        Default
                                            If (local36 <> Null) Then
                                                createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                                selecteditem = Null
                                            Else
                                                swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                            EndIf
                                    End Select
                                ElseIf (TX60DB8XBBZ(local22)\Field6\Field9 = $2E) Then
                                    local41 = Null
                                    Select selecteditem\Field6\Field9
                                        Case $00,$01,$02
                                            If (local36 <> Null) Then
                                                createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                                selecteditem = Null
                                            Else
                                                swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                            EndIf
                                        Default
                                            If ((((selecteditem\Field6\Field9 = $19) And (i_714\Field0 = $02)) Lor ((selecteditem\Field6\Field9 = $18) And (i_714\Field0 = $01))) <> 0) Then
                                                createmsg(getlocalstring("msg", "takeoff"), 6.0)
                                                selecteditem = Null
                                            ElseIf (local36 <> TX60DB8XBBZ(local22)) Then
                                                If (local36 <> Null) Then
                                                    nullsecondinv(local36)
                                                EndIf
                                                For local42 = $00 To (TX60DB8XBBZ(local22)\Field36 - $01) Step $01
                                                    If (TX60DB8XBBZ(local22)\Field8[local42] = Null) Then
                                                        If (selecteditem <> Null) Then
                                                            GUESSEDsetnullsecondinv(selecteditem, TX60DB8XBBZ(local22))
                                                            TX60DB8XBBZ(local22)\Field8[local42] = selecteditem
                                                            TX60DB8XBBZ(local22)\Field20 = TX60DB8XBBZ(local22)\Field6\Field14
                                                            For local43 = $00 To (maxitemamount - $01) Step $01
                                                                If (TX60DB8XBBZ(local43) = selecteditem) Then
                                                                    TX60DB8XBBZ(local43) = Null
                                                                    playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                                                    Exit
                                                                EndIf
                                                            Next
                                                            local41 = selecteditem
                                                            selecteditem = Null
                                                            Exit
                                                        EndIf
                                                    EndIf
                                                Next
                                                If (selecteditem <> Null) Then
                                                    createmsg(getlocalstring("msg", "wallet.full"), 6.0)
                                                Else
                                                    createmsg(format(getlocalstring("msg", "wallet.add"), local41\Field6\Field24, "%s"), 6.0)
                                                EndIf
                                            Else
                                                selecteditem = Null
                                            EndIf
                                    End Select
                                ElseIf (TX60DB8XBBZ(local22)\Field6\Field9 = $13) Then
                                    local41 = Null
                                    Select selecteditem\Field6\Field9
                                        Case $14,$15,$16,$25
                                            For local42 = $00 To (TX60DB8XBBZ(local22)\Field36 - $01) Step $01
                                                If (TX60DB8XBBZ(local22)\Field8[local42] = Null) Then
                                                    If (selecteditem <> Null) Then
                                                        GUESSEDsetnullsecondinv(selecteditem, TX60DB8XBBZ(local22))
                                                        TX60DB8XBBZ(local22)\Field8[local42] = selecteditem
                                                        For local43 = $00 To (maxitemamount - $01) Step $01
                                                            If (TX60DB8XBBZ(local43) = selecteditem) Then
                                                                TX60DB8XBBZ(local43) = Null
                                                                playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                                                Exit
                                                            EndIf
                                                        Next
                                                        local41 = selecteditem
                                                        selecteditem = Null
                                                        Exit
                                                    EndIf
                                                EndIf
                                            Next
                                            If (selecteditem <> Null) Then
                                                createmsg(getlocalstring("msg", "500.full"), 6.0)
                                            Else
                                                createmsg(format(getlocalstring("msg", "500.add"), local41\Field6\Field24, "%s"), 6.0)
                                            EndIf
                                        Default
                                            swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                    End Select
                                ElseIf (local36 <> Null) Then
                                    createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                    selecteditem = Null
                                Else
                                    swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                EndIf
                                selecteditem = Null
                            Case $51
                                Select TX60DB8XBBZ(local22)\Field6\Field9
                                    Case $49
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 0.0)
                                        createmsg(getlocalstring("msg", "nav.bat"), 6.0)
                                    Case $4B
                                        createmsg(getlocalstring("msg", "nav.bat.notfit"), 6.0)
                                    Case $4C,$4A
                                        createmsg(getlocalstring("msg", "nav.bat.no"), 6.0)
                                    Case $45
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 0.0)
                                        createmsg(getlocalstring("msg", "radio.bat"), 6.0)
                                    Case $46
                                        createmsg(getlocalstring("msg", "radio.bat.notfit"), 6.0)
                                    Case $47,$48
                                        createmsg(getlocalstring("msg", "radio.bat.no"), 6.0)
                                    Case $40
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 0.0)
                                        createmsg(getlocalstring("msg", "nvg.bat"), 6.0)
                                    Case $41
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $42
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $43
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 0.0)
                                        createmsg(getlocalstring("msg", "gear.bat"), 6.0)
                                    Case $44
                                        createmsg(getlocalstring("msg", "gear.bat.notfit"), 6.0)
                                    Case $4D
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 0.0)
                                        createmsg(getlocalstring("msg", "e.reader.bat"), 6.0)
                                    Case $4E
                                        createmsg(getlocalstring("msg", "e.reader.bat.notfit"), 6.0)
                                    Case $4F
                                        createmsg(getlocalstring("msg", "e.reader.bat.no"), 6.0)
                                    Default
                                        swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                        selecteditem = Null
                                End Select
                            Case $50
                                Select TX60DB8XBBZ(local22)\Field6\Field9
                                    Case $49
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 100.0)
                                        createmsg(getlocalstring("msg", "nav.bat"), 6.0)
                                    Case $4B
                                        createmsg(getlocalstring("msg", "nav.bat.notfit"), 6.0)
                                    Case $4C,$4A
                                        createmsg(getlocalstring("msg", "nav.bat.no"), 6.0)
                                    Case $45
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 100.0)
                                        createmsg(getlocalstring("msg", "radio.bat"), 6.0)
                                    Case $46
                                        createmsg(getlocalstring("msg", "radio.bat.notfit"), 6.0)
                                    Case $47,$48
                                        createmsg(getlocalstring("msg", "radio.bat.no"), 6.0)
                                    Case $40
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 1000.0)
                                        createmsg(getlocalstring("msg", "nvg.bat"), 6.0)
                                    Case $41
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $42
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $43
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 1000.0)
                                        createmsg(getlocalstring("msg", "gear.bat"), 6.0)
                                    Case $44
                                        createmsg(getlocalstring("msg", "gear.bat.notfit"), 6.0)
                                    Case $4D
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 100.0)
                                        createmsg(getlocalstring("msg", "e.reader.bat"), 6.0)
                                    Case $4E
                                        createmsg(getlocalstring("msg", "e.reader.bat.notfit"), 6.0)
                                    Case $4F
                                        createmsg(getlocalstring("msg", "e.reader.bat.no"), 6.0)
                                    Default
                                        swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                        selecteditem = Null
                                End Select
                            Case $52
                                Select TX60DB8XBBZ(local22)\Field6\Field9
                                    Case $49
                                        createmsg(getlocalstring("msg", "nav.bat.notfit"), 6.0)
                                    Case $4B
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 100.0)
                                        createmsg(getlocalstring("msg", "nav.bat"), 6.0)
                                    Case $4C,$4A
                                        createmsg(getlocalstring("msg", "nav.bat.no"), 6.0)
                                    Case $45
                                        createmsg(getlocalstring("msg", "radio.bat.notfit"), 6.0)
                                    Case $46
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(50.0, 100.0)
                                        createmsg(getlocalstring("msg", "radio.bat"), 6.0)
                                    Case $47,$48
                                        createmsg(getlocalstring("msg", "radio.bat.no"), 6.0)
                                    Case $40
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $41
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 1000.0)
                                        createmsg(getlocalstring("msg", "nvg.bat"), 6.0)
                                    Case $42
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $43
                                        createmsg(getlocalstring("msg", "gear.bat.notfit"), 6.0)
                                    Case $44
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 1000.0)
                                        createmsg(getlocalstring("msg", "gear.bat"), 6.0)
                                    Case $4D
                                        createmsg(getlocalstring("msg", "e.reader.bat.notfit"), 6.0)
                                    Case $4E
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = rnd(500.0, 1000.0)
                                        createmsg(getlocalstring("msg", "e.reader.bat"), 6.0)
                                    Case $4F
                                        createmsg(getlocalstring("msg", "e.reader.bat.no"), 6.0)
                                    Default
                                        swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                        selecteditem = Null
                                End Select
                            Case $53,$54
                                Select TX60DB8XBBZ(local22)\Field6\Field9
                                    Case $49
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = 1000.0
                                        createmsg(getlocalstring("msg", "nav.bat"), 6.0)
                                    Case $4B
                                        createmsg(getlocalstring("msg", "nav.bat.notfit"), 6.0)
                                    Case $4C,$4A
                                        createmsg(getlocalstring("msg", "nav.bat.no"), 6.0)
                                    Case $45
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = 1000.0
                                        createmsg(getlocalstring("msg", "radio.bat"), 6.0)
                                    Case $46
                                        createmsg(getlocalstring("msg", "radio.bat.notfit"), 6.0)
                                    Case $47,$48
                                        createmsg(getlocalstring("msg", "radio.bat.no"), 6.0)
                                    Case $40
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = 10000.0
                                        createmsg(getlocalstring("msg", "nvg.bat"), 6.0)
                                    Case $41
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $42
                                        createmsg(getlocalstring("msg", "nvg.bat.notfit"), 6.0)
                                    Case $43
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = 10000.0
                                        createmsg(getlocalstring("msg", "gear.bat"), 6.0)
                                    Case $44
                                        createmsg(getlocalstring("msg", "gear.bat.notfit"), 6.0)
                                    Case $4D
                                        If (selecteditem\Field6\Field5 <> $42) Then
                                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                                        EndIf
                                        removeitem(selecteditem, $01)
                                        TX60DB8XBBZ(local22)\Field15 = 1000.0
                                        createmsg(getlocalstring("msg", "e.reader.bat"), 6.0)
                                    Case $4E
                                        createmsg(getlocalstring("msg", "e.reader.bat.notfit"), 6.0)
                                    Case $4F
                                        createmsg(getlocalstring("msg", "e.reader.bat.no"), 6.0)
                                    Default
                                        swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                        selecteditem = Null
                                End Select
                            Default
                                If (local36 = Null) Then
                                    swapinventoryitem(selecteditem, TX60DB8XBBZ(local22))
                                Else
                                    otheropen = local36
                                    createmsg(getlocalstring("msg", "it.cannot.swap"), 6.0)
                                    selecteditem = Null
                                EndIf
                        End Select
                    EndIf
                    C20FB8DZF = Null
                EndIf
                selecteditem = Null
            EndIf
        EndIf
        If (invopen = $00) Then
            stopmousemovement()
        EndIf
    ElseIf (selecteditem <> Null) Then
        Select selecteditem\Field6\Field9
            Case $38,$39,$3A,$3B
                If (preventitemoverlapping($01, $00, $00, (T8660BZ460\Field7 <> $02), $00, $00, $01) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $38
                            If (isdoubleitem(T8660BZ460\Field3, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $39
                            If (isdoubleitem(T8660BZ460\Field3, $02) <> 0) Then
                                Return $00
                            EndIf
                        Case $3A
                            If (isdoubleitem(T8660BZ460\Field3, $03) <> 0) Then
                                Return $00
                            EndIf
                        Case $3B
                            If (isdoubleitem(T8660BZ460\Field3, $04) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    If (selecteditem\Field6\Field9 <> $3B) Then
                        selecteditem\Field15 = min((selecteditem\Field15 + fps\Field3[$00]), 100.0)
                    Else
                        selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 1.6)), 100.0)
                    EndIf
                    If (100.0 = selecteditem\Field15) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (T8660BZ460\Field3 > $00) Then
                            createmsg(getlocalstring("msg", "mask.off"), 6.0)
                            T8660BZ460\Field3 = $00
                        Else
                            Select selecteditem\Field6\Field9
                                Case $38
                                    createmsg(getlocalstring("msg", "mask.on"), 6.0)
                                    T8660BZ460\Field3 = $01
                                Case $39
                                    createmsg(getlocalstring("msg", "mask.on.dry"), 6.0)
                                    T8660BZ460\Field3 = $02
                                Case $3A
                                    createmsg(getlocalstring("msg", "mask.on.easy"), 6.0)
                                    T8660BZ460\Field3 = $03
                                Case $3B
                                    createmsg(getlocalstring("msg", "mask.on.easy"), 6.0)
                                    T8660BZ460\Field3 = $04
                            End Select
                        EndIf
                        selecteditem\Field15 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $7E
                local57 = selecteditem\Field6\Field9
                If (local57 = $7E) Then
                    If (isdoubleitem(T8660BZ460\Field4, $01) <> 0) Then
                        Return $00
                    EndIf
                EndIf
                XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 0.7)), 100.0)
                If (100.0 = selecteditem\Field15) Then
                    If (selecteditem\Field6\Field5 <> $42) Then
                        playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                    EndIf
                    If (T8660BZ460\Field4 > $00) Then
                        createmsg(getlocalstring("msg", "headphones.off"), 6.0)
                    Else
                        createmsg(getlocalstring("msg", "headphones.on"), 6.0)
                    EndIf
                    T8660BZ460\Field4 = (T8660BZ460\Field4 = $00)
                    selecteditem\Field15 = 0.0
                    selecteditem = Null
                EndIf
            Case $22,$23
                If (preventitemoverlapping($00, $00, $01, $00, $00, $00, $01) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $22
                            If (isdoubleitem(i_1499\Field8, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $23
                            If (isdoubleitem(i_1499\Field8, $02) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 1.5)), 100.0)
                    If (100.0 = selecteditem\Field15) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (i_1499\Field8 > $00) Then
                            createmsg(getlocalstring("msg", "mask.off"), 6.0)
                            i_1499\Field8 = $00
                        Else
                            giveachievement("1499", $01)
                            For local2 = Each rooms
                                If (local2\Field22\Field21 = $70) Then
                                    XZ0260X8X2\Field53 = -10.0
                                    i_1499\Field2 = playerroom
                                    i_1499\Field1 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    i_1499\Field3 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    i_1499\Field6 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    If ((((0.0 = i_1499\Field5) And (0.0 = i_1499\Field0)) And (0.0 = i_1499\Field7)) <> 0) Then
                                        positionentity(XZ0260X8X2\Field74, (local2\Field40 + 23.77344), (local2\Field3 + 1.1875), (local2\Field37 + 8.955078), $00)
                                        rotateentity(XZ0260X8X2\Field74, 0.0, 90.0, 0.0, $01)
                                    Else
                                        positionentity(XZ0260X8X2\Field74, i_1499\Field5, (i_1499\Field0 + 0.05), i_1499\Field7, $00)
                                    EndIf
                                    resetentity(XZ0260X8X2\Field74)
                                    teleporttoroom(local2)
                                    playsound_strict(loadtempsound("SFX\SCP\1499\Enter.ogg"), $00, $00)
                                    i_1499\Field5 = 0.0
                                    i_1499\Field0 = 0.0
                                    i_1499\Field7 = 0.0
                                    If (n_i\Field10 <> Null) Then
                                        If (n_i\Field10\Field63 <> $00) Then
                                            setstreamvolume_strict(n_i\Field10\Field63, 0.0)
                                        EndIf
                                    EndIf
                                    For local0 = Each events
                                        If (local0\Field32 = $4C) Then
                                            If (1051.178 < entitydistancesquared(local0\Field19\Field15, XZ0260X8X2\Field74)) Then
                                                If (5.0 > local0\Field7) Then
                                                    local0\Field7 = (local0\Field7 + 1.0)
                                                EndIf
                                            EndIf
                                            Exit
                                        EndIf
                                    Next
                                    Exit
                                EndIf
                            Next
                            Select selecteditem\Field6\Field9
                                Case $22
                                    createmsg(getlocalstring("msg", "mask.on"), 6.0)
                                    i_1499\Field8 = $01
                                Case $23
                                    createmsg(getlocalstring("msg", "mask.on.easy"), 6.0)
                                    i_1499\Field8 = $02
                            End Select
                        EndIf
                        selecteditem\Field15 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $40,$41,$42
                If (preventitemoverlapping($00, $01, $00, (T8660BZ460\Field7 <> $02), $00, $00, $01) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $40
                            If (isdoubleitem(T8660BZ460\Field8, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $41
                            If (isdoubleitem(T8660BZ460\Field8, $02) <> 0) Then
                                Return $00
                            EndIf
                        Case $42
                            If (isdoubleitem(T8660BZ460\Field8, $03) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    selecteditem\Field39 = min((selecteditem\Field39 + fps\Field3[$00]), 100.0)
                    If (100.0 = selecteditem\Field39) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (T8660BZ460\Field8 > $00) Then
                            createmsg(getlocalstring("msg", "nvg.off"), 6.0)
                            T8660BZ460\Field8 = $00
                            If (0.0 < selecteditem\Field15) Then
                                playsound_strict(loadtempsound("SFX\Interact\NVGOff.ogg"), $00, $00)
                            EndIf
                        Else
                            createmsg(getlocalstring("msg", "nvg.on"), 6.0)
                            Select selecteditem\Field6\Field9
                                Case $40
                                    T8660BZ460\Field8 = $01
                                Case $41
                                    T8660BZ460\Field8 = $02
                                Case $42
                                    T8660BZ460\Field8 = $03
                            End Select
                            If (0.0 < selecteditem\Field15) Then
                                playsound_strict(loadtempsound("SFX\Interact\NVGOn.ogg"), $00, $00)
                            EndIf
                        EndIf
                        selecteditem\Field39 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $43,$44
                If (preventitemoverlapping($00, $00, $00, (T8660BZ460\Field7 <> $02), $01, $00, $01) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $43
                            If (isdoubleitem(T8660BZ460\Field11, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $44
                            If (isdoubleitem(T8660BZ460\Field11, $02) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    selecteditem\Field39 = min((selecteditem\Field39 + fps\Field3[$00]), 100.0)
                    If (100.0 = selecteditem\Field39) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (T8660BZ460\Field11 > $00) Then
                            createmsg(getlocalstring("msg", "gear.off"), 6.0)
                            T8660BZ460\Field11 = $00
                        Else
                            createmsg(getlocalstring("msg", "gear.on"), 6.0)
                            Select selecteditem\Field6\Field9
                                Case $43
                                    T8660BZ460\Field11 = $01
                                Case $44
                                    T8660BZ460\Field11 = $02
                            End Select
                        EndIf
                        selecteditem\Field39 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $26,$74
                If (preventitemoverlapping($01, $01, $01, $01, $01, $00, $00) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $26
                            If (isdoubleitem(T8660BZ460\Field7, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $74
                            If (isdoubleitem(T8660BZ460\Field7, $02) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 0.7)), 100.0)
                    If (100.0 = selecteditem\Field15) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (T8660BZ460\Field7 <> 0) Then
                            createmsg(getlocalstring("msg", "helmet.off"), 6.0)
                            T8660BZ460\Field7 = $00
                        Else
                            createmsg(getlocalstring("msg", "helmet.on"), 6.0)
                            Select selecteditem\Field6\Field9
                                Case $26
                                    T8660BZ460\Field7 = $01
                                Case $74
                                    T8660BZ460\Field7 = $02
                            End Select
                        EndIf
                        selecteditem\Field15 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $0B,$0C,$0D
                If (preventitemoverlapping($01, $01, $01, $00, $01, $00, $01) = $00) Then
                    Select selecteditem\Field6\Field9
                        Case $0B
                            If (isdoubleitem(i_268\Field2, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $0C
                            If (isdoubleitem(i_268\Field2, $02) <> 0) Then
                                Return $00
                            EndIf
                        Case $0D
                            If (isdoubleitem(i_268\Field2, $03) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                    selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 0.7)), 100.0)
                    If (100.0 = selecteditem\Field15) Then
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        If (i_268\Field2 > $00) Then
                            If (((i_268\Field2 > $01) And (0.0 < i_268\Field1)) <> 0) Then
                                playsound_strict(loadtempsound("SFX\SCP\268\InvisibilityOff.ogg"), $00, $00)
                            EndIf
                            createmsg(getlocalstring("msg", "cap.off"), 6.0)
                            i_268\Field2 = $00
                        Else
                            giveachievement("268", $01)
                            createmsg(getlocalstring("msg", "cap.on"), 6.0)
                            Select selecteditem\Field6\Field9
                                Case $0B
                                    i_268\Field2 = $01
                                Case $0C
                                    i_268\Field2 = $02
                                Case $0D
                                    i_268\Field2 = $03
                            End Select
                            If (i_268\Field2 > $01) Then
                                playsound_strict(loadtempsound("SFX\SCP\268\InvisibilityOn.ogg"), $00, $00)
                            EndIf
                        EndIf
                        selecteditem\Field15 = 0.0
                        selecteditem = Null
                    EndIf
                EndIf
            Case $27,$28
                XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                selecteditem\Field15 = min(((fps\Field3[$00] / (((Float (selecteditem\Field6\Field9 = $28)) * 0.5) + 2.0)) + selecteditem\Field15), 100.0)
                If (100.0 = selecteditem\Field15) Then
                    If (T8660BZ460\Field6 > $00) Then
                        T8660BZ460\Field6 = $00
                        If (GUESSEDupdatexdb() = $00) Then
                            createmsg(getlocalstring("msg", "vest.off"), 6.0)
                            dropitem(selecteditem, $01)
                        EndIf
                    Else
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        Select selecteditem\Field6\Field9
                            Case $27
                                createmsg(getlocalstring("msg", "vest.on.slight"), 6.0)
                                T8660BZ460\Field6 = $01
                            Case $28
                                createmsg(getlocalstring("msg", "vest.on.heavy"), 6.0)
                                T8660BZ460\Field6 = $02
                        End Select
                    EndIf
                    selecteditem\Field15 = 0.0
                    selecteditem = Null
                EndIf
            Case $3C,$3D,$3E,$3F
                XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                selecteditem\Field15 = min(((fps\Field3[$00] / ((Float (selecteditem\Field6\Field9 = $3F)) + 3.0)) + selecteditem\Field15), 100.0)
                If (100.0 = selecteditem\Field15) Then
                    If (T8660BZ460\Field10 > $00) Then
                        createmsg(getlocalstring("msg", "suit.off"), 6.0)
                        T8660BZ460\Field10 = $00
                        dropitem(selecteditem, $01)
                    Else
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        T8660BZ460\Field3 = $00
                        T8660BZ460\Field7 = $00
                        i_427\Field2 = $00
                        i_1499\Field8 = $00
                        i_268\Field2 = $00
                        Select selecteditem\Field6\Field9
                            Case $3C
                                createmsg(getlocalstring("msg", "suit.on"), 6.0)
                                T8660BZ460\Field10 = $01
                            Case $3D
                                createmsg(getlocalstring("msg", "suit.dry"), 6.0)
                                T8660BZ460\Field10 = $02
                            Case $3E
                                createmsg(getlocalstring("msg", "suit.on.easy"), 6.0)
                                T8660BZ460\Field10 = $03
                            Case $3F
                                createmsg(getlocalstring("msg", "suit.on.easy"), 6.0)
                                T8660BZ460\Field10 = $04
                        End Select
                    EndIf
                    selecteditem\Field15 = 0.0
                    selecteditem = Null
                EndIf
            Case $17
                giveachievement("513", $01)
                playsound_strict(loadtempsound("SFX\SCP\513\Bell.ogg"), $00, $00)
                XZ0260X8X2\Field68 = max(6.0, XZ0260X8X2\Field68)
                If ((((n_i\Field0 = Null) And (T8660BZ460\Field4 = $00)) And (XZ0260X8X2\Field61 = $00)) <> 0) Then
                    n_i\Field0 = createnpc($0B, 0.0, 0.0, 0.0)
                EndIf
                selecteditem = Null
            Case $7B
                If (((GUESSEDupdatexdb() <> $00) And XZ0260X8X2\Field61) <> 0) Then
                    createmsg(getlocalstring("mpmsg", "513"), 6.0)
                Else
                    giveachievement("513", $01)
                    playsound_strict(loadtempsound("SFX\SCP\513\BellLoud.ogg"), $00, $00)
                    If (((n_i\Field0 = Null) And (XZ0260X8X2\Field61 = $00)) <> 0) Then
                        n_i\Field0 = createnpc($0B, 0.0, 0.0, 0.0)
                    EndIf
                    If (XZ0260X8X2\Field61 <> 0) Then
                        msg\Field8 = getlocalstring("death", "513")
                        kill($01, $01, $00, $01)
                    EndIf
                    XZ0260X8X2\Field64 = max(1000.0, XZ0260X8X2\Field64)
                    GUESSEDupdategui(((((Float selecteddifficulty\Field8) * 15.0) + 67.5) * 70.0))
                    XZ0260X8X2\Field14 = 8.0
                    setemitter(Null, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $1D)
                    For local3 = Each npcs
                        If (((64.0 > entitydistancesquared(local3\Field82, XZ0260X8X2\Field74)) And (local3\Field1 = $00)) <> 0) Then
                            Select local3\Field77
                                Case $00,$01
                                    If (((0.0 < local3\Field66) And (5.0 > local3\Field66)) <> 0) Then
                                        setnpcframe(local3, (62.0 - ((Float (local3\Field77 = $01)) * 3.0)), $01)
                                        local3\Field17 = $00
                                        local3\Field66 = 5.0
                                    EndIf
                                Case $03
                                    If (6.0 <> local3\Field66) Then
                                        setnpcframe(local3, 474.0, $01)
                                        local3\Field66 = 6.0
                                    EndIf
                                Case $04
                                    If (((0.0 < local3\Field66) And (5.0 > local3\Field66)) <> 0) Then
                                        setnpcframe(local3, 944.0, $01)
                                        local3\Field17 = $00
                                        local3\Field66 = 5.0
                                    EndIf
                                Case $0C
                                    If (3.0 = local3\Field66) Then
                                        local3\Field63 = playsoundex(loadtempsound((("SFX\SCP\860_2\Cancer" + (Str rand($03, $05))) + ".ogg")), camera, local3\Field82, 10.0, 1.0, $01, $00)
                                        local3\Field17 = $15E
                                    EndIf
                                Case $0D
                                    If (6.0 <> local3\Field66) Then
                                        loadnpcsound(local3, (((("SFX\SCP\939\" + (Str (local3\Field56 Mod $03))) + "Attack") + (Str rand($00, $02))) + ".ogg"), $00)
                                        local3\Field63 = playsoundex(local3\Field55, camera, local3\Field82, 10.0, 1.0, $01, $00)
                                        If (0.0 = local3\Field57) Then
                                            local3\Field38 = (Float rand($02, $01))
                                            setnpcframe(local3, (((Float (2.0 = local3\Field38)) * 100.0) + 570.0), $01)
                                        Else
                                            local3\Field38 = 0.0
                                            setnpcframe(local3, 1493.0, $01)
                                        EndIf
                                        local3\Field66 = 5.0
                                    EndIf
                                Case $11,$15
                                    local3\Field4 = $00
                                Case $18
                                    If (7.0 <> local3\Field66) Then
                                        If (local3 = n_i\Field11) Then
                                            playmtfsound(loadtempsound("SFX\Character\MTF\OMFG.ogg"), local3)
                                        EndIf
                                        setnpcframe(local3, 1050.0, $01)
                                        local3\Field13 = (Int local3\Field66)
                                        local3\Field17 = $00
                                        local3\Field66 = 7.0
                                    EndIf
                            End Select
                        EndIf
                    Next
                EndIf
                selecteditem = Null
            Case $14
                If (canuseitem($01, $00, $00) <> 0) Then
                    giveachievement("500", $01)
                    createmsg(getlocalstring("msg", "pill"), 6.0)
                    If (0.0 < i_008\Field0) Then
                        createmsg(getlocalstring("msg", "pill.nausea"), 6.0)
                        i_008\Field1 = $01
                    EndIf
                    If (0.0 < i_409\Field0) Then
                        createmsg(getlocalstring("msg", "pill.crystals"), 6.0)
                        i_409\Field1 = $01
                    EndIf
                    If (0.0 < i_1048a\Field2) Then
                        i_1048a\Field1 = $01
                        StopChannel(i_1048a\Field0)
                        i_1048a\Field0 = $00
                        createmsg(getlocalstring("msg", "pill.ears"), 6.0)
                    EndIf
                    i_009\Field1 = $01
                    i_966\Field1 = 0.0
                    i_966\Field0 = 0.0
                    XZ0260X8X2\Field26 = 0.0
                    XZ0260X8X2\Field56 = 100.0
                    For local9 = $00 To $06 Step $01
                        i_1025\Field0[local9] = 0.0
                    Next
                    If (0.0 < i_1025\Field1[$00]) Then
                        For local9 = (maxitemamount - $02) To (maxitemamount - $01) Step $01
                            If (TX60DB8XBBZ(local9) <> Null) Then
                                dropitem(TX60DB8XBBZ(local9), $01)
                            EndIf
                        Next
                        maxitemamount = (maxitemamount - $02)
                        i_1025\Field1[$00] = 0.0
                    EndIf
                    For local9 = $01 To $04 Step $01
                        i_1025\Field1[local9] = 0.0
                    Next
                    If (1.0 < XZ0260X8X2\Field65) Then
                        XZ0260X8X2\Field65 = 1.0
                        XZ0260X8X2\Field34 = 0.0
                    EndIf
                    If (1.0 < XZ0260X8X2\Field7) Then
                        XZ0260X8X2\Field7 = 1.0
                        XZ0260X8X2\Field30 = 0.0
                    EndIf
                    removeitem(selecteditem, $01)
                EndIf
            Case $37
                If (canuseitem($01, $00, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    If (100.0 = selecteditem\Field39) Then
                        Select rand($07, $01)
                            Case $01
                                XZ0260X8X2\Field11 = 3.5
                                createmsg(getlocalstring("msg", "bleed"), 6.0)
                            Case $02
                                resetnegativestats($00)
                                createmsg(getlocalstring("msg", "rapidly"), 6.0)
                            Case $03
                                XZ0260X8X2\Field64 = 10000.0
                                XZ0260X8X2\Field39 = 0.0
                                createmsg(getlocalstring("msg", "nausea"), 6.0)
                            Case $04
                                XZ0260X8X2\Field53 = -10.0
                                If (playerinreachableroom($01, $00, $01) = $00) Then
                                    XZ0260X8X2\Field11 = 2.5
                                    createmsg(getlocalstring("msg", "bleed"), 6.0)
                                Else
                                    movetopocketdimension()
                                    createmsg(getlocalstring("msg", "aid.106"), 6.0)
                                EndIf
                            Case $05
                                chs\Field1 = (GUESSEDupdatexdb() = $00)
                                createmsg(getlocalstring("msg", "aid.super"), 6.0)
                            Case $06
                                kill($00, $01, $00, $01)
                                msg\Field8 = getlocalstring("death", "kill_1")
                            Case $07
                                XZ0260X8X2\Field64 = 1000.0
                                If (rand($02, $01) = $01) Then
                                    If (0.0 = i_008\Field0) Then
                                        i_008\Field0 = 15.0
                                    EndIf
                                ElseIf (0.0 = i_409\Field0) Then
                                    i_409\Field0 = 25.0
                                EndIf
                        End Select
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $7D
                If (canuseitem($01, $01, $01) <> 0) Then
                    local72 = $00
                    For local9 = $00 To (maxitemamount - $01) Step $01
                        If (((TX60DB8XBBZ(local9) <> Null) And (TX60DB8XBBZ(local9)\Field6\Field11 > $00)) <> 0) Then
                            local72 = $01
                            Exit
                        EndIf
                    Next
                    If (local72 <> 0) Then
                        XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 5.0)
                        selecteditem\Field15 = min((selecteditem\Field15 + (fps\Field3[$00] / 4.0)), 100.0)
                        If (100.0 = selecteditem\Field15) Then
                            For local9 = $00 To (maxitemamount - $01) Step $01
                                If (((TX60DB8XBBZ(local9) <> Null) And (TX60DB8XBBZ(local9)\Field6\Field11 > $00)) <> 0) Then
                                    local73 = GUESSEDrenderrendergui_4(TX60DB8XBBZ(local9)\Field6\Field11)
                                    If (((local73 <> Null) And (local73\Field3\Field48 = "")) <> 0) Then
                                        TX60DB8XBBZ(local9)\Field3 = (Float local73\Field3\Field6)
                                    EndIf
                                EndIf
                            Next
                            createmsg(getlocalstring("mpmsg", "ammo.resupply"), 6.0)
                            removeitem(selecteditem, $01)
                            selecteditem = Null
                        EndIf
                    Else
                        createmsg(getlocalstring("mpmsg", "ammo.nogun"), 6.0)
                        selecteditem = Null
                    EndIf
                EndIf
            Case $34,$36,$35
                If (canuseitem($01, $01, $00) <> 0) Then
                    If (((0.0 = XZ0260X8X2\Field39) And (0.0 = XZ0260X8X2\Field11)) <> 0) Then
                        createmsg(getlocalstring("msg", "aid.no"), 6.0)
                        selecteditem = Null
                        Return $00
                    Else
                        If (XZ0260X8X2\Field25 = $00) Then
                            setcrouch($01)
                        EndIf
                        selecteditem\Field15 = min(((fps\Field3[$00] / ((Float (selecteditem\Field6\Field9 = $34)) + 4.0)) + selecteditem\Field15), 100.0)
                        If (100.0 = selecteditem\Field15) Then
                            If (selecteditem\Field6\Field9 = $36) Then
                                XZ0260X8X2\Field39 = max(0.0, (XZ0260X8X2\Field39 - 50.0))
                                XZ0260X8X2\Field11 = max(0.0, (XZ0260X8X2\Field11 - 1.5))
                                If (0.0 = XZ0260X8X2\Field11) Then
                                    createmsg(getlocalstring("msg", "aid.fine"), 6.0)
                                ElseIf (1.0 < XZ0260X8X2\Field11) Then
                                    createmsg(getlocalstring("msg", "aid.bleed"), 6.0)
                                Else
                                    createmsg(getlocalstring("msg", "aid.sore"), 6.0)
                                EndIf
                            Else
                                XZ0260X8X2\Field39 = max(0.0, (XZ0260X8X2\Field39 - rnd(10.0, 20.0)))
                                If (2.5 <= XZ0260X8X2\Field11) Then
                                    createmsg(getlocalstring("msg", "aid.toobad_1"), 6.0)
                                    XZ0260X8X2\Field11 = max(2.5, (XZ0260X8X2\Field11 - rnd(0.3, 0.6)))
                                ElseIf (1.0 < XZ0260X8X2\Field11) Then
                                    XZ0260X8X2\Field11 = max(0.5, (XZ0260X8X2\Field11 - rnd(0.5, 0.9)))
                                    If (1.0 < XZ0260X8X2\Field11) Then
                                        createmsg(getlocalstring("msg", "aid.toobad_2"), 6.0)
                                    Else
                                        createmsg(getlocalstring("msg", "aid.stop"), 6.0)
                                    EndIf
                                ElseIf (0.5 < XZ0260X8X2\Field11) Then
                                    XZ0260X8X2\Field11 = 0.5
                                    createmsg(getlocalstring("msg", "aid.slight"), 6.0)
                                Else
                                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 / 2.0)
                                    createmsg(getlocalstring("msg", "aid.nowalk"), 6.0)
                                EndIf
                                If (selecteditem\Field6\Field9 = $35) Then
                                    Select rand($07, $01)
                                        Case $01
                                            chs\Field1 = $01
                                            createmsg(getlocalstring("msg", "aid.super"), 6.0)
                                        Case $02
                                            opt\Field0 = (opt\Field0 = $00)
                                            opt\Field18 = (opt\Field18 = $00)
                                            createmsg(getlocalstring("msg", "aid.invert"), 6.0)
                                        Case $03
                                            XZ0260X8X2\Field64 = 5000.0
                                            createmsg(getlocalstring("msg", "nausea"), 6.0)
                                        Case $04
                                            XZ0260X8X2\Field7 = 0.5
                                            XZ0260X8X2\Field30 = rnd(20.0, 30.0)
                                        Case $05
                                            XZ0260X8X2\Field65 = 0.3
                                            XZ0260X8X2\Field34 = rnd(25.0, 35.0)
                                        Case $06
                                            XZ0260X8X2\Field39 = 0.0
                                            XZ0260X8X2\Field11 = 0.0
                                            createmsg(getlocalstring("msg", "aid.stopall"), 6.0)
                                        Case $07
                                            createmsg(getlocalstring("msg", "aid.through"), 6.0)
                                            XZ0260X8X2\Field11 = 3.5
                                    End Select
                                EndIf
                            EndIf
                            If (selecteditem\Field6\Field5 <> $42) Then
                                playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                            EndIf
                            removeitem(selecteditem, $01)
                        EndIf
                    EndIf
                EndIf
            Case $30,$31
                If (canuseitem($00, $00, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field7 = 0.6
                        XZ0260X8X2\Field30 = rnd(25.0, 35.0)
                        XZ0260X8X2\Field64 = 200.0
                        XZ0260X8X2\Field53 = min((XZ0260X8X2\Field53 + (XZ0260X8X2\Field12 / 2.0)), XZ0260X8X2\Field12)
                        If (selecteditem\Field6\Field9 = $31) Then
                            XZ0260X8X2\Field39 = max((XZ0260X8X2\Field39 - rnd(5.0, 10.0)), 0.0)
                        EndIf
                        createmsg(getlocalstring("msg", "eyedrop.moisturized"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $32
                If (canuseitem($00, $00, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field7 = 0.4
                        XZ0260X8X2\Field30 = rnd(35.0, 45.0)
                        XZ0260X8X2\Field64 = 200.0
                        XZ0260X8X2\Field53 = XZ0260X8X2\Field12
                        createmsg(getlocalstring("msg", "eyedrop.moisturized.very"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $33
                If (canuseitem($00, $00, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field7 = 0.0
                        XZ0260X8X2\Field30 = 60.0
                        XZ0260X8X2\Field43 = 8400.0
                        XZ0260X8X2\Field64 = 1000.0
                        createmsg(getlocalstring("msg", "eyedrop.moisturized.veryvery"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $1E
                giveachievement("1025", $01)
                If (0.0 = selecteditem\Field39) Then
                    selecteditem\Field15 = (Float rand($00, $06))
                    If ((((i_714\Field0 = $00) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                        i_1025\Field0[(Int selecteditem\Field15)] = max(1.0, i_1025\Field0[(Int selecteditem\Field15)])
                    EndIf
                    selecteditem\Field39 = 1.0
                EndIf
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = scaleimageex(loadimage_strict((("GFX\Items\HUD Textures\page_1025(" + (Str ((Int selecteditem\Field15) + $01))) + ").png")), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                    maskimage(selecteditem\Field6\Field25, $FF, $00, $FF)
                EndIf
            Case $1F
                giveachievement("1025", $01)
                If (0.0 = selecteditem\Field39) Then
                    selecteditem\Field15 = (Float rand(((GUESSEDupdatexdb() <> $00) + $00), $05))
                    If ((((i_714\Field0 = $00) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                        Select selecteditem\Field15
                            Case 0.0
                                If (0.0 = i_1025\Field1[$00]) Then
                                    maxitemamount = (maxitemamount + $02)
                                    injureplayer(1.5, 0.0, 1000.0, 0.0, 0.0)
                                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg")), $00, $00)
                                    createmsg(getlocalstring("msg", "extraparts"), 6.0)
                                    i_1025\Field1[$00] = 1.0
                                EndIf
                            Case 5.0
                                If (0.0 = i_008\Field0) Then
                                    i_008\Field0 = (i_008\Field0 + 0.001)
                                EndIf
                            Default
                                i_1025\Field1[(Int selecteditem\Field15)] = max(1.0, i_1025\Field1[(Int selecteditem\Field15)])
                        End Select
                    EndIf
                    selecteditem\Field39 = 1.0
                EndIf
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = scaleimageex(loadimage_strict((("GFX\Items\HUD Textures\page_fine_1025(" + (Str ((Int selecteditem\Field15) + $01))) + ").png")), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                    maskimage(selecteditem\Field6\Field25, $FF, $00, $FF)
                EndIf
            Case $20
                createmsg(getlocalstring("msg", "redbook"), 6.0)
                selecteditem = Null
            Case $2B
                If (canuseitem($01, $00, $00) <> 0) Then
                    If (_S2IMapContains(i_294\Field3, selecteditem\Field19) <> 0) Then
                        local76 = _JsonGetArrayValue(i_294\Field0, _S2IMapGet(i_294\Field3, selecteditem\Field19))
                        If (_JsonIsNull(_JsonGetValue(local76, "refuse_message")) <> 0) Then
                            XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                            selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.6)), 100.0)
                            If (100.0 = selecteditem\Field39) Then
                                local5 = _JsonGetValue(local76, "drink_message")
                                If (_JsonIsNull(local5) = $00) Then
                                    createmsg(_JsonGetString(local5), 6.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "vomit")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (0.0 = XZ0260X8X2\Field82) Then
                                        XZ0260X8X2\Field82 = _JsonGetFloat(local5)
                                    Else
                                        XZ0260X8X2\Field82 = min(XZ0260X8X2\Field82, _JsonGetFloat(local5))
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "blur")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field64 = max((XZ0260X8X2\Field64 + (_JsonGetFloat(local5) * 70.0)), 0.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "camera_shake")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field60 = max((XZ0260X8X2\Field60 + _JsonGetFloat(local5)), 0.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "deaf_timer")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field9 = max((XZ0260X8X2\Field9 + _JsonGetFloat(local5)), 0.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "damage")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 + _JsonGetFloat(local5)), 0.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "bloodloss")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field39 = max((XZ0260X8X2\Field39 + _JsonGetFloat(local5)), 0.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "energy")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field56 = min((((Float rand((Int (_JsonGetFloat(local5) / 2.0)), (Int _JsonGetFloat(local5)))) * selecteditem\Field15) + XZ0260X8X2\Field56), 100.0)
                                EndIf
                                local5 = _JsonGetValue(local76, "drink_sound")
                                If (_JsonIsNull(local5) = $00) Then
                                    local18 = _JsonGetString(local5)
                                    If (((local18 = "SFX\SCP\294\Burn.ogg") And (0.0 < i_1025\Field1[$03])) = $00) Then
                                        playsound_strict(loadtempsound(local18), $01, $00)
                                        GUESSEDupdateplayannouncement(local18, $01, TXXF6F02DB2[GUESSEDupdatedropitem()], 10.0, 1.0, 0.0, 0.0, 0.0)
                                    Else
                                        XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.5)
                                        playsound_strict(loadtempsound("SFX\SCP\294\Slurp.ogg"), $01, $00)
                                        GUESSEDupdateplayannouncement("SFX\SCP\294\Slurp.ogg", $01, TXXF6F02DB2[GUESSEDupdatedropitem()], 10.0, 1.0, 0.0, 0.0, 0.0)
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "stomachache")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (_JsonGetBool(local5) <> 0) Then
                                        i_1025\Field0[$03] = 1.0
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "infection")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (_JsonGetBool(local5) <> 0) Then
                                        i_008\Field0 = (i_008\Field0 + 0.001)
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "crystallization")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (_JsonGetBool(local5) <> 0) Then
                                        i_409\Field0 = (i_409\Field0 + 0.001)
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "mutation")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (_JsonGetBool(local5) <> 0) Then
                                        If (25200.0 > i_427\Field1) Then
                                            i_427\Field1 = 25200.0
                                        EndIf
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "revitalize")
                                If (_JsonIsNull(local5) = $00) Then
                                    If (_JsonGetBool(local5) <> 0) Then
                                        For local9 = $00 To $06 Step $01
                                            i_1025\Field0[local9] = 0.0
                                        Next
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "death_timer")
                                If (_JsonIsNull(local5) = $00) Then
                                    local77 = (Int _JsonGetFloat(local5))
                                    local5 = _JsonGetValue(local76, "death_message")
                                    If (_JsonIsNull(local5) = $00) Then
                                        msg\Field8 = _JsonGetString(local5)
                                    EndIf
                                    If (0.0 = (Float local77)) Then
                                        kill($00, $01, $00, $01)
                                    ElseIf (0.0 = XZ0260X8X2\Field26) Then
                                        XZ0260X8X2\Field26 = ((Float local77) * 70.0)
                                    EndIf
                                EndIf
                                local5 = _JsonGetValue(local76, "blink_effect")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field7 = (_JsonGetFloat(local5) ^ selecteditem\Field15)
                                EndIf
                                local5 = _JsonGetValue(local76, "blink_timer")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field30 = (_JsonGetFloat(local5) * selecteditem\Field15)
                                EndIf
                                local5 = _JsonGetValue(local76, "stamina_effect")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field65 = (max(_JsonGetFloat(local5), 0.1) ^ selecteditem\Field15)
                                EndIf
                                local5 = _JsonGetValue(local76, "stamina_timer")
                                If (_JsonIsNull(local5) = $00) Then
                                    XZ0260X8X2\Field34 = (min(_JsonGetFloat(local5), 300.0) * selecteditem\Field15)
                                EndIf
                                local1 = createitem("Empty Cup", $2C, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                local1\Field17 = $01
                                For local9 = $00 To (maxitemamount - $01) Step $01
                                    If (TX60DB8XBBZ(local9) = selecteditem) Then
                                        TX60DB8XBBZ(local9) = local1
                                        Exit
                                    EndIf
                                Next
                                entitytype(local1\Field9, $03, $00)
                                removeitem(selecteditem, $01)
                            EndIf
                        Else
                            createmsg(_JsonGetString(_JsonGetValue(local76, "refuse_message")), 6.0)
                            selecteditem = Null
                        EndIf
                    Else
                        createmsg(getlocalstring("msg", "cup.unknown"), 6.0)
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $6C
                If (canuseitem($01, $00, $00) <> 0) Then
                    createmsg(getlocalstring("msg", "pizza"), 6.0)
                    playsound_strict(loadtempsound("SFX\SCP\458\Eating.ogg"), $00, $00)
                    removeitem(selecteditem, $01)
                EndIf
            Case $55
                If (canuseitem($01, $01, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field45 = rnd(20.0, 30.0)
                        XZ0260X8X2\Field65 = 0.7
                        XZ0260X8X2\Field34 = (Float rand($28, $3C))
                        XZ0260X8X2\Field56 = min((XZ0260X8X2\Field56 + 25.0), 100.0)
                        createmsg(getlocalstring("msg", "syringe_1"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $56
                If (canuseitem($01, $01, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field45 = rnd(30.0, 40.0)
                        XZ0260X8X2\Field65 = 0.5
                        XZ0260X8X2\Field34 = rnd(60.0, 80.0)
                        XZ0260X8X2\Field56 = min((XZ0260X8X2\Field56 + 50.0), 100.0)
                        createmsg(getlocalstring("msg", "syringe_2"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $57
                If (canuseitem($01, $01, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        Select rand($03, $01)
                            Case $01
                                XZ0260X8X2\Field45 = 60.0
                                XZ0260X8X2\Field65 = 0.1
                                XZ0260X8X2\Field34 = 120.0
                                XZ0260X8X2\Field56 = 100.0
                                createmsg(getlocalstring("msg", "syringe_3"), 6.0)
                            Case $02
                                chs\Field1 = $01
                                createmsg(getlocalstring("msg", "syringe_4"), 6.0)
                            Case $03
                                XZ0260X8X2\Field82 = 30.0
                                createmsg(getlocalstring("msg", "syringe_5"), 6.0)
                        End Select
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $58
                If (canuseitem($01, $01, $00) <> 0) Then
                    selecteditem\Field39 = min((selecteditem\Field39 + (fps\Field3[$00] / 0.7)), 100.0)
                    XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, 10.0)
                    If (100.0 = selecteditem\Field39) Then
                        XZ0260X8X2\Field45 = rnd(10.0, 20.0)
                        XZ0260X8X2\Field65 = 0.8
                        XZ0260X8X2\Field34 = (Float rand($0F, $1E))
                        XZ0260X8X2\Field56 = min((XZ0260X8X2\Field56 + 10.0), 100.0)
                        XZ0260X8X2\Field82 = 70.0
                        i_008\Field0 = (i_008\Field0 + 1.0)
                        createmsg(getlocalstring("msg", "syringe_6"), 6.0)
                        If (selecteditem\Field6\Field5 <> $42) Then
                            playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                        EndIf
                        removeitem(selecteditem, $01)
                    EndIf
                EndIf
            Case $0F
                If (canuseitem($01, $00, $00) <> 0) Then
                    Select rand($06, $01)
                        Case $01
                            createmsg(getlocalstring("msg", "cigarette_1"), 6.0)
                        Case $02
                            createmsg(getlocalstring("msg", "cigarette_2"), 6.0)
                        Case $03
                            createmsg(getlocalstring("msg", "cigarette_3"), 6.0)
                        Case $04
                            createmsg(getlocalstring("msg", "cigarette_4"), 6.0)
                        Case $05
                            createmsg(getlocalstring("msg", "cigarette_5"), 6.0)
                        Case $06
                            createmsg(getlocalstring("msg", "cigarette_6"), 6.0)
                    End Select
                    removeitem(selecteditem, $01)
                EndIf
            Case $0E
                If (canuseitem($01, $00, $00) <> 0) Then
                    If (i_714\Field0 > $00) Then
                        createmsg(getlocalstring("msg", "420j.no"), 6.0)
                    Else
                        createmsg(getlocalstring("msg", "420j.yeah"), 6.0)
                        XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - 0.5), 0.0)
                        XZ0260X8X2\Field64 = 500.0
                        giveachievement("420j", $01)
                        playsound_strict(loadtempsound("SFX\Music\Using420J.ogg"), $00, $00)
                        GUESSEDisentity_10(Null, "SFX\Music\Using420J.ogg", XZ0260X8X2\Field74, 20.0, 1.0)
                    EndIf
                    removeitem(selecteditem, $01)
                EndIf
            Case $10,$11
                If (canuseitem($01, $00, $00) <> 0) Then
                    If (i_714\Field0 > $00) Then
                        createmsg(getlocalstring("msg", "420j.no"), 6.0)
                    Else
                        createmsg(getlocalstring("msg", "420j.dead"), 6.0)
                        msg\Field8 = format(getlocalstring("death", "joint"), subjectname, "%s")
                        kill($00, $01, $00, $01)
                    EndIf
                    removeitem(selecteditem, $01)
                EndIf
            Case $19,$18
                If (canuseitem($01, $01, $00) <> 0) Then
                    Select selecteditem\Field6\Field9
                        Case $18
                            If (isdoubleitem(i_714\Field0, $01) <> 0) Then
                                Return $00
                            EndIf
                        Case $19
                            If (isdoubleitem(i_714\Field0, $02) <> 0) Then
                                Return $00
                            EndIf
                    End Select
                    If (i_714\Field0 > $00) Then
                        createmsg(getlocalstring("msg", "714.off"), 6.0)
                        i_714\Field0 = $00
                    Else
                        giveachievement("714", $01)
                        createmsg(getlocalstring("msg", "714.on"), 6.0)
                        Select selecteditem\Field6\Field9
                            Case $18
                                i_714\Field0 = $01
                            Case $19
                                i_714\Field0 = $02
                        End Select
                    EndIf
                    selecteditem = Null
                EndIf
            Case $1A,$1B
                If (canuseitem($01, $01, $00) <> 0) Then
                    If (selecteditem\Field6\Field9 = $1A) Then
                        createmsg(getlocalstring("msg", "714.sleep"), 6.0)
                        msg\Field8 = format(getlocalstring("death", "ringsleep"), subjectname, "%s")
                        kill($00, $01, $00, $01)
                    Else
                        createmsg(getlocalstring("msg", "714.small"), 6.0)
                    EndIf
                    selecteditem = Null
                EndIf
            Case $05
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = resizeimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                    maskimage(selecteditem\Field6\Field25, $FF, $00, $FF)
                EndIf
                If (0.0 = selecteditem\Field15) Then
                    createmsg(getlocalstring("msg", "ticket"), 6.0)
                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\NostalgiaCancer" + (Str rand($00, $04))) + ".ogg")), $00, $00)
                    selecteditem\Field15 = 1.0
                EndIf
            Case $03,$04
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = scaleimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                EndIf
                If (0.0 = selecteditem\Field15) Then
                    If (selecteditem\Field6\Field19 = "Old Badge") Then
                        createmsg(getlocalstring("msg", "oldbadge"), 6.0)
                    EndIf
                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\NostalgiaCancer" + (Str rand($05, $09))) + ".ogg")), $00, $00)
                    selecteditem\Field15 = 1.0
                EndIf
            Case $01
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = scaleimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                EndIf
                If (0.0 = selecteditem\Field15) Then
                    XZ0260X8X2\Field64 = 1000.0
                    createmsg(getlocalstring("msg", "oldpaper"), 6.0)
                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\NostalgiaCancer" + (Str rand($05, $09))) + ".ogg")), $00, $00)
                    selecteditem\Field15 = 1.0
                EndIf
            Case $12
                If (canuseitem($01, $01, $00) <> 0) Then
                    If (i_427\Field2 <> 0) Then
                        createmsg(getlocalstring("msg", "427.off"), 6.0)
                        selecteditem\Field20 = selecteditem\Field6\Field14
                        i_427\Field2 = $00
                    Else
                        createmsg(getlocalstring("msg", "427.on"), 6.0)
                        selecteditem\Field20 = selecteditem\Field6\Field10
                        giveachievement("427", $01)
                        i_427\Field2 = $01
                    EndIf
                    selecteditem = Null
                EndIf
            Case $16,$25
                If (canuseitem($01, $00, $00) <> 0) Then
                    If (selecteditem\Field6\Field9 = $25) Then
                        If (2.0 > i_2022\Field0) Then
                            i_2022\Field1 = (i_2022\Field1 + 20.0)
                            XZ0260X8X2\Field39 = 0.0
                            giveachievement("2022", $01)
                            createmsg(getlocalstring("msg", "pill.2022"), 6.0)
                        Else
                            i_2022\Field1 = 0.0
                            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 1.2)
                            XZ0260X8X2\Field39 = (XZ0260X8X2\Field39 + 30.0)
                            createmsg(getlocalstring("msg", "pill.2022.burn"), 6.0)
                            i_1025\Field0[$02] = 1.0
                            playsound_strict(loadtempsound("SFX\SCP\294\Burn.ogg"), $00, $00)
                            XZ0260X8X2\Field82 = 30.0
                        EndIf
                        i_2022\Field0 = (i_2022\Field0 + 1.0)
                    Else
                        createmsg(getlocalstring("msg", "pill"), 6.0)
                    EndIf
                    i_1025\Field0[$00] = 0.0
                    removeitem(selecteditem, $01)
                EndIf
            Case $15
                If (canuseitem($01, $00, $00) <> 0) Then
                    createmsg(getlocalstring("msg", "pill"), 6.0)
                    If (25200.0 > i_427\Field1) Then
                        i_427\Field1 = 25200.0
                    EndIf
                    removeitem(selecteditem, $01)
                EndIf
            Case $24
                If (0.0 < selecteditem\Field15) Then
                    If (GUESSEDrenderrenderdebughud_3() < maxitemamount) Then
                        local1 = createitem("SCP-2022-01", $25, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                        entitytype(local1\Field9, $03, $00)
                        pickitem(local1, $00)
                        selecteditem\Field15 = (selecteditem\Field15 - 1.0)
                        createmsg(getlocalstring("msg", "2022.take"), 6.0)
                    Else
                        createmsg(getlocalstring("msg", "cantcarry"), 6.0)
                    EndIf
                    selecteditem = Null
                Else
                    createmsg(getlocalstring("msg", "2022.empty"), 6.0)
                    removeitem(selecteditem, $01)
                EndIf
            Case $21
                use1123()
                selecteditem = Null
            Case $00
                If (selecteditem\Field6\Field25 = $00) Then
                    selecteditem\Field6\Field25 = scaleimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                    Select selecteditem\Field6\Field19
                        Case "Burnt Note"
                            setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                            drawimage($00, $00, $00, $00)
                            color($00, $00, $00, $FF)
                            setfontex(XD00026ZX2\Field0[$00])
                            textex((Int (277.0 * menuscale)), (Int (469.0 * menuscale)), (Str code_dr_maynard), $01, $01)
                            setbuffer(backbuffer(), $00, $00)
                            copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field25), imageheight(selecteditem\Field6\Field25), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field25, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field25, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field25, $00))
                        Case "Unknown Note"
                            setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                            drawimage($00, $00, $00, $00)
                            color($55, $55, $8C, $FF)
                            setfontex(XD00026ZX2\Field0[$04])
                            textex((Int (300.0 * menuscale)), (Int (275.0 * menuscale)), (Str T20200F42ZD), $01, $01)
                            setbuffer(backbuffer(), $00, $00)
                            copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field25), imageheight(selecteditem\Field6\Field25), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field25, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field25, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field25, $00))
                        Case "Document SCP-372"
                            setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                            drawimage($00, $00, $00, $00)
                            color($25, $2D, $89, $FF)
                            setfontex(XD00026ZX2\Field0[$04])
                            textex((Int (383.0 * menuscale)), (Int (734.0 * menuscale)), (Str code_maintenance_tunnels), $01, $01)
                            setbuffer(backbuffer(), $00, $00)
                            copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field25), imageheight(selecteditem\Field6\Field25), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field25, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field25, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field25, $00))
                        Case "SCP-085"
                            For local4 = Each itemtemplates
                                If (local4\Field19 = selecteditem\Field19) Then
                                    local4\Field2 = (("GFX\Items\HUD Textures\note_085(" + (Str (Int selecteditem\Field15))) + ").png")
                                    local4\Field13 = local4\Field2
                                    local14 = getrescaledtexture(local4\Field13, $01, $91, $CC, $00, $00)
                                    entitytexture(selecteditem\Field5, local14, $00, $00)
                                    deletesingletextureentryfromcache(local14, $00)
                                    local14 = $00
                                    selecteditem\Field15 = min((selecteditem\Field15 + 1.0), 3.0)
                                    Exit
                                EndIf
                            Next
                    End Select
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                EndIf
            Case $4D,$4E,$4F
                local5 = ((0.0 < selecteditem\Field15) Lor (selecteditem\Field6\Field9 = $4F))
                If (selecteditem\Field6\Field25 = $00) Then
                    local18 = "_off"
                    If (((0.0 < selecteditem\Field15) Lor local5) <> 0) Then
                        local18 = "_on"
                    EndIf
                    selecteditem\Field6\Field2 = (("GFX\Items\HUD Textures\e_reader" + local18) + ".png")
                    selecteditem\Field6\Field25 = resizeimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                    selecteditem\Field6\Field3 = (imagewidth(selecteditem\Field6\Field25) Sar $01)
                    selecteditem\Field6\Field4 = (imageheight(selecteditem\Field6\Field25) Sar $01)
                    maskimage(selecteditem\Field6\Field25, $FF, $00, $FF)
                    createhintmsg(getlocalstring("msg", "e.reader"), 6.0, $00)
                EndIf
                selecteditem\Field15 = max(0.0, (selecteditem\Field15 - (fps\Field3[$00] * 0.005)))
                local9 = getkey()
                Select local9
                    Case $31
                        selecteditem\Field3 = max(0.0, (selecteditem\Field3 - 1.0))
                        currereaderpage = selecteditem\Field0[(Int selecteditem\Field3)]
                        playsound_strict(buttonsfx[$00], $00, $00)
                        If (selecteditem\Field6\Field15 <> $00) Then
                            freeimage(selecteditem\Field6\Field15)
                            selecteditem\Field6\Field15 = $00
                        EndIf
                    Case $32
                        selecteditem\Field3 = min((Float selecteditem\Field32), (selecteditem\Field3 + 1.0))
                        currereaderpage = selecteditem\Field0[(Int selecteditem\Field3)]
                        playsound_strict(buttonsfx[$00], $00, $00)
                        If (selecteditem\Field6\Field15 <> $00) Then
                            freeimage(selecteditem\Field6\Field15)
                            selecteditem\Field6\Field15 = $00
                        EndIf
                    Case $33
                        currereaderpage = Null
                        selecteditem\Field3 = 0.0
                        playsound_strict(buttonsfx[$00], $00, $00)
                        If (selecteditem\Field6\Field15 <> $00) Then
                            freeimage(selecteditem\Field6\Field15)
                            selecteditem\Field6\Field15 = $00
                        EndIf
                End Select
                If (local5 <> 0) Then
                    selecteditem\Field39 = 0.0
                    If (currereaderpage <> Null) Then
                        If (selecteditem\Field6\Field15 = $00) Then
                            local12 = (0.748 * menuscale)
                            selecteditem\Field6\Field15 = scaleimageex(loadimage_strict(currereaderpage\Field2), local12, local12, $01)
                            Select strippath(currereaderpage\Field2)
                                Case "note_Maynard.png"
                                    setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                                    drawimage($00, $00, $00, $00)
                                    color($00, $00, $00, $FF)
                                    setfontex(XD00026ZX2\Field0[$00])
                                    textex((Int (277.0 * local12)), (Int (469.0 * local12)), (Str code_dr_maynard), $01, $01)
                                    setbuffer(backbuffer(), $00, $00)
                                    copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field15), imageheight(selecteditem\Field6\Field15), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field15, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field15, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field15, $00))
                                Case "note_unknown.png"
                                    setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                                    drawimage($00, $00, $00, $00)
                                    color($55, $55, $8C, $FF)
                                    setfontex(XD00026ZX2\Field0[$04])
                                    textex((Int (300.0 * local12)), (Int (275.0 * local12)), (Str T20200F42ZD), $01, $01)
                                    setfontex(XD00026ZX2\Field0[$00])
                                    setbuffer(backbuffer(), $00, $00)
                                    copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field15), imageheight(selecteditem\Field6\Field15), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field15, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field15, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field15, $00))
                                Case "doc_372.png"
                                    setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                                    drawimage($00, $00, $00, $00)
                                    color($25, $2D, $89, $FF)
                                    setfontex(XD00026ZX2\Field0[$04])
                                    textex((Int (383.0 * local12)), (Int (734.0 * local12)), (Str code_maintenance_tunnels), $01, $01)
                                    setfontex(XD00026ZX2\Field0[$00])
                                    setbuffer(backbuffer(), $00, $00)
                                    copyrectstretch($00, $00, imagewidth(selecteditem\Field6\Field15), imageheight(selecteditem\Field6\Field15), $00, $00, bufferwidth(imagebuffer(selecteditem\Field6\Field15, $00)), bufferheight(imagebuffer(selecteditem\Field6\Field15, $00)), texturebuffer(resizetexture, $00), imagebuffer(selecteditem\Field6\Field15, $00))
                            End Select
                            selecteditem\Field6\Field17 = (imagewidth(selecteditem\Field6\Field15) Sar $01)
                            selecteditem\Field6\Field18 = (imageheight(selecteditem\Field6\Field15) Sar $01)
                        EndIf
                    EndIf
                    If (((20.0 > selecteditem\Field15) And (selecteditem\Field6\Field9 <> $4F)) <> 0) Then
                        If (70.0 <= batmsgtimer) Then
                            If (ChannelPlaying(lowbatterychn[$00]) = $00) Then
                                XZ0260X8X2\Field68 = max(4.0, XZ0260X8X2\Field68)
                                lowbatterychn[$00] = playsound_strict(snd_i\Field4[$00], $00, $00)
                            EndIf
                        EndIf
                    EndIf
                Else
                    If (0.0 = selecteditem\Field39) Then
                        freeimage(selecteditem\Field6\Field25)
                        selecteditem\Field6\Field25 = $00
                        selecteditem\Field6\Field2 = "GFX\Items\HUD Textures\e_reader_off.png"
                        selecteditem\Field6\Field25 = resizeimageex(loadimage_strict(selecteditem\Field6\Field2), menuscale, menuscale, $01)
                        maskimage(selecteditem\Field6\Field25, $FF, $00, $FF)
                        selecteditem\Field39 = 1.0
                    EndIf
                    createhintmsg(getlocalstring("msg", "bat.combine"), 1.0, $01)
                EndIf
            Default
                If (selecteditem\Field36 > $00) Then
                    otheropen = selecteditem
                EndIf
                If (selecteditem\Field6\Field9 = $13) Then
                    playsound_strict(loadtempsound("SFX\Interact\OpenBottle.ogg"), $00, $00)
                EndIf
                If (selecteditem\Field6\Field11 > $00) Then
                    If (GUESSEDrenderitems() = selecteditem) Then
                        GUESSEDfindchild(Null, Null, $01)
                    Else
                        GUESSEDfindchild(GUESSEDrenderrendergui_4(selecteditem\Field6\Field11), selecteditem, $00)
                    EndIf
                    selecteditem = Null
                Else
                    Select selecteditem\Field6\Field9
                        Case $59,$5A,$5B,$5C,$5D,$5E,$5F,$60,$1C,$1D,$64,$65,$66,$6A,$06,$07,$08,$68,$67,$6B,$61,$62,$75
                        Default
                            selecteditem = Null
                    End Select
                EndIf
        End Select
        If (selecteditem <> Null) Then
            If (((((((((menuopen Lor consoleopen) Lor TX6X48DXXDX) = $00) And (TDD0Z6BXB6\Field12 Lor keyhit(key\Field13))) Lor (Int XZ0260X8X2\Field48)) Lor (0.0 > XZ0260X8X2\Field52)) Lor (XZ0260X8X2\Field38 < $02)) Lor XZ0260X8X2\Field23) <> 0) Then
                Select selecteditem\Field6\Field9
                    Case $34,$36,$35,$0B,$0C,$0D,$22,$23,$38,$39,$3A,$3B,$7E,$26,$7D
                        selecteditem\Field15 = 0.0
                    Case $27,$28
                        selecteditem\Field15 = 0.0
                        If (GUESSEDupdatexdb() = $00) Then
                            If (T8660BZ460\Field6 = $00) Then
                                dropitem(selecteditem, $00)
                            EndIf
                        EndIf
                    Case $3C,$3D,$3E,$3F
                        selecteditem\Field15 = 0.0
                        If (T8660BZ460\Field10 = $00) Then
                            dropitem(selecteditem, $00)
                        EndIf
                    Case $40,$41,$42,$43,$44,$1E,$1F,$2B,$30,$31,$32,$33,$37,$55,$56,$57,$58
                        selecteditem\Field39 = 0.0
                    Case $4D,$4E,$4F
                        selecteditem\Field3 = 0.0
                        currereaderpage = Null
                End Select
                If (selecteditem\Field6\Field5 <> $42) Then
                    playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                EndIf
                If (selecteditem\Field6\Field25 <> $00) Then
                    selecteditem\Field6\Field3 = $00
                    selecteditem\Field6\Field4 = $00
                    freeimage(selecteditem\Field6\Field25)
                    selecteditem\Field6\Field25 = $00
                EndIf
                If (selecteditem\Field6\Field15 <> $00) Then
                    selecteditem\Field6\Field17 = $00
                    selecteditem\Field6\Field18 = $00
                    freeimage(selecteditem\Field6\Field15)
                    selecteditem\Field6\Field15 = $00
                EndIf
                selecteditem = Null
            EndIf
        EndIf
    ElseIf (ChannelPlaying(lowbatterychn[$00]) <> 0) Then
        StopChannel(lowbatterychn[$00])
        lowbatterychn[$00] = $00
    EndIf
    If (GUESSEDrenderitems() <> Null) Then
        local87 = GUESSEDrenderitems()
        Select local87\Field6\Field9
            Case $45,$46,$47,$48
                local5 = ((local87\Field6\Field9 = $47) Lor (local87\Field6\Field9 = $48))
                If (TDD0Z6BXB6\Field12 <> 0) Then
                    GUESSEDplaychannel_4(buttonsfx[$00], $00)
                    local87\Field3 = (- local87\Field3)
                    GUESSEDsettxbfb(local87)
                EndIf
                local87\Field15 = max(0.0, (local87\Field15 - (fps\Field3[$00] * (((Float (local87\Field6\Field9 = $45)) * 0.002) + 0.002))))
                If ((((0.0 < local87\Field15) Lor local5) And (0.0 < local87\Field3)) <> 0) Then
                    If (local87\Field6\Field25 = $00) Then
                        local87\Field6\Field2 = "GFX\Items\HUD Textures\radio_off.png"
                        local87\Field6\Field25 = GUESSEDscaleresize_2(loadimage_strict(local87\Field6\Field2), (252.0 * menuscale), (590.0 * menuscale), $01)
                        local87\Field6\Field3 = imagewidth(local87\Field6\Field25)
                        local87\Field6\Field4 = imageheight(local87\Field6\Field25)
                        createhintmsg(getlocalstring("msg", "radio"), 6.0, $00)
                    EndIf
                    isusingradio = $01
                    If (0.0 = radiostate[$05]) Then
                        radiostate[$05] = 1.0
                        radiostate[$00] = -1.0
                    EndIf
                    local89 = keydown($CB)
                    local90 = keydown($CD)
                    local91 = $00
                    If ((local89 Lor local90) <> 0) Then
                        XZ0260X8X2\Field57 = ((fps\Field3[$00] * (XZ0260X8X2\Field31 + 1.0)) + XZ0260X8X2\Field57)
                        If (25.0 <= XZ0260X8X2\Field57) Then
                            XZ0260X8X2\Field57 = 0.0
                            TDD0Z6BXB6\Field7 = $01
                            XZ0260X8X2\Field31 = (XZ0260X8X2\Field31 + 0.2)
                            local91 = $01
                        EndIf
                    Else
                        XZ0260X8X2\Field57 = 0.0
                        XZ0260X8X2\Field31 = 0.0
                    EndIf
                    If ((local89 Lor local90) <> 0) Then
                        If (local89 <> 0) Then
                            If (((100.0 <= local87\Field3) And (400.0 >= local87\Field3)) <> 0) Then
                                If (keyhit($CB) <> 0) Then
                                    local87\Field3 = max((Float (Int (local87\Field3 - 100.0))), 100.0)
                                    playsound_strict(snd_i\Field39, $00, $00)
                                EndIf
                            ElseIf (local91 <> 0) Then
                                local87\Field3 = max((local87\Field3 - 2.0), 100.0)
                            EndIf
                        EndIf
                        If (local90 <> 0) Then
                            If (((100.0 <= local87\Field3) And (400.0 >= local87\Field3)) <> 0) Then
                                If (keyhit($CD) <> 0) Then
                                    local87\Field3 = min((Float (Int (local87\Field3 + 100.0))), 80000.0)
                                    playsound_strict(snd_i\Field39, $00, $00)
                                EndIf
                            ElseIf (local91 <> 0) Then
                                local87\Field3 = min((local87\Field3 + 2.0), 80000.0)
                            EndIf
                        EndIf
                        GUESSEDsettxbfb(local87)
                        For local9 = $00 To $06 Step $01
                            If (ChannelPlaying(radiochn[local9]) <> 0) Then
                                StopChannel(radiochn[local9])
                                radiochn[local9] = $00
                            EndIf
                        Next
                    Else
                        If (((playerroom\Field22\Field21 = $6F) Lor (playerroom\Field22\Field21 = $70)) <> 0) Then
                            For local9 = $00 To $05 Step $01
                                If (ChannelPlaying(radiochn[local9]) <> 0) Then
                                    PauseChannel(radiochn[local9])
                                EndIf
                            Next
                            If (ChannelPlaying(radiochn[$06]) = $00) Then
                                radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                            EndIf
                        ElseIf (8.0 > coffindistance) Then
                            For local9 = $00 To $05 Step $01
                                If (ChannelPlaying(radiochn[local9]) <> 0) Then
                                    PauseChannel(radiochn[local9])
                                EndIf
                            Next
                            If (ChannelPlaying(radiochn[$06]) = $00) Then
                                radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field57, $00)
                            EndIf
                        ElseIf (local87\Field6\Field9 = $48) Then
                            local87\Field3 = -1.0
                            If (ChannelPlaying(radiochn[$06]) = $00) Then
                                radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                            EndIf
                            radiostate[$06] = (fps\Field3[$00] + radiostate[$06])
                            local6 = (Int mid((Str code_dr_gears), (Int (radiostate[$08] + 1.0)), $01))
                            If ((((radiostate[$07] * 50.0) >= (radiostate[$06] - fps\Field3[$00])) And (radiostate[$06] > (radiostate[$07] * 50.0))) <> 0) Then
                                GUESSEDplaychannel_4(snd_i\Field45, $00)
                                radiostate[$07] = (radiostate[$07] + 1.0)
                                If ((Float local6) <= radiostate[$07]) Then
                                    radiostate[$07] = 0.0
                                    radiostate[$06] = -100.0
                                    radiostate[$08] = (radiostate[$08] + 1.0)
                                    If (4.0 = radiostate[$08]) Then
                                        radiostate[$08] = 0.0
                                        radiostate[$06] = -200.0
                                    EndIf
                                EndIf
                            EndIf
                        Else
                            Select (Int (local87\Field3 / 100.0))
                                Case $00
                                    If (opt\Field81 = $00) Then
                                        If (ChannelPlaying(radiochn[$06]) = $00) Then
                                            radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                                        EndIf
                                    ElseIf (usertrackmusicamount < $01) Then
                                        If (ChannelPlaying(radiochn[$06]) = $00) Then
                                            radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                                        EndIf
                                    Else
                                        If (ChannelPlaying(radiochn[$06]) <> 0) Then
                                            StopChannel(radiochn[$06])
                                            radiochn[$06] = $00
                                        EndIf
                                        If (ChannelPlaying(radiochn[$00]) = $00) Then
                                            If (usertrackflag = $00) Then
                                                If (opt\Field81 = $01) Then
                                                    If ((Float (usertrackmusicamount - $01)) > radiostate[$00]) Then
                                                        radiostate[$00] = (radiostate[$00] + 1.0)
                                                    Else
                                                        radiostate[$00] = 0.0
                                                    EndIf
                                                    usertrackflag = $01
                                                ElseIf (opt\Field81 = $02) Then
                                                    radiostate[$00] = (Float rand($00, (usertrackmusicamount - $01)))
                                                EndIf
                                            EndIf
                                            If (currusertrack <> $00) Then
                                                freesound_strict(currusertrack)
                                                currusertrack = $00
                                            EndIf
                                            currusertrack = loadsound_strict(("SFX\Radio\UserTracks\" + usertrackname[(Int radiostate[$00])]))
                                            radiochn[$00] = GUESSEDplaychannel_4(currusertrack, $00)
                                        Else
                                            usertrackflag = $00
                                        EndIf
                                        If (keyhit($02) <> 0) Then
                                            GUESSEDplaychannel_4(snd_i\Field39, $00)
                                            If (usertrackflag = $00) Then
                                                If (opt\Field81 = $01) Then
                                                    If ((Float (usertrackmusicamount - $01)) > radiostate[$00]) Then
                                                        radiostate[$00] = (radiostate[$00] + 1.0)
                                                    Else
                                                        radiostate[$00] = 0.0
                                                    EndIf
                                                    usertrackflag = $01
                                                ElseIf (opt\Field81 = $02) Then
                                                    radiostate[$00] = (Float rand($00, (usertrackmusicamount - $01)))
                                                EndIf
                                            EndIf
                                            If (currusertrack <> $00) Then
                                                freesound_strict(currusertrack)
                                                currusertrack = $00
                                            EndIf
                                            currusertrack = loadsound_strict(("SFX\Radio\UserTracks\" + usertrackname[(Int radiostate[$00])]))
                                            radiochn[$00] = GUESSEDplaychannel_4(currusertrack, $00)
                                        EndIf
                                    EndIf
                                Case $01
                                    If (ChannelPlaying(radiochn[$06]) <> 0) Then
                                        StopChannel(radiochn[$06])
                                        radiochn[$06] = $00
                                    EndIf
                                    If (ChannelPlaying(radiochn[$01]) = $00) Then
                                        If (5.0 <= radiostate[$01]) Then
                                            radiochn[$01] = GUESSEDplaychannel_4(YXZ2BB66B($00, $01), $00)
                                            radiostate[$01] = 0.0
                                        Else
                                            radiostate[$01] = (radiostate[$01] + 1.0)
                                            radiochn[$01] = GUESSEDplaychannel_4(YXZ2BB66B($00, $00), $00)
                                        EndIf
                                    EndIf
                                Case $02
                                    If (ChannelPlaying(radiochn[$06]) <> 0) Then
                                        StopChannel(radiochn[$06])
                                        radiochn[$06] = $00
                                    EndIf
                                    If (ChannelPlaying(radiochn[$02]) = $00) Then
                                        radiostate[$02] = (radiostate[$02] + 1.0)
                                        If (17.0 = radiostate[$02]) Then
                                            radiostate[$02] = 1.0
                                        EndIf
                                        If (ceil((radiostate[$02] / 2.0)) = floor((radiostate[$02] / 2.0))) Then
                                            radiochn[$02] = GUESSEDplaychannel_4(YXZ2BB66B($01, (Int (radiostate[$02] / 2.0))), $00)
                                        Else
                                            radiochn[$02] = GUESSEDplaychannel_4(YXZ2BB66B($01, $00), $00)
                                        EndIf
                                    EndIf
                                Case $03
                                    If (((ChannelPlaying(radiochn[$06]) = $00) And (ChannelPlaying(radiochn[$03]) = $00)) <> 0) Then
                                        radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                                    EndIf
                                    If (0.0 < mtftimer) Then
                                        If (radiostate2[$06] = $00) Then
                                            radiostate[$03] = (max((Float rand($FFFFFFF6, $01)), 0.0) + radiostate[$03])
                                        EndIf
                                        Select radiostate[$03]
                                            Case 40.0
                                                If (radiostate2[$00] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random0.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$00] = $01
                                                EndIf
                                            Case 400.0
                                                If (radiostate2[$01] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random1.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$01] = $01
                                                EndIf
                                            Case 800.0
                                                If (radiostate2[$02] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random2.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$02] = $01
                                                EndIf
                                            Case 1200.0
                                                If (radiostate2[$03] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random3.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$03] = $01
                                                EndIf
                                            Case 1600.0
                                                If (radiostate2[$04] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random4.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$04] = $01
                                                EndIf
                                            Case 2000.0
                                                If (radiostate2[$05] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random5.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$05] = $01
                                                EndIf
                                            Case 2400.0
                                                If (radiostate2[$06] = $00) Then
                                                    radiochn[$03] = GUESSEDplaychannel_4(loadtempsound("SFX\Character\MTF\Random6.ogg"), $01)
                                                    radiostate[$03] = (radiostate[$03] + 1.0)
                                                    radiostate2[$06] = $01
                                                EndIf
                                        End Select
                                    EndIf
                                Case $04
                                    If (ChannelPlaying(radiochn[$06]) = $00) Then
                                        radiochn[$06] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                                    EndIf
                                    If (ChannelPlaying(radiochn[$04]) = $00) Then
                                        If (((remotedooron = $00) And (0.0 = radiostate[$08])) <> 0) Then
                                            radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Chatter2.ogg"), $01)
                                            radiostate[$08] = 1.0
                                        Else
                                            radiostate[$04] = (max((Float rand($FFFFFFF6, $01)), 0.0) + radiostate[$04])
                                            Select radiostate[$04]
                                                Case 10.0
                                                    If (n_i\Field2\Field93 = $00) Then
                                                        If (radiostate3[$00] = $00) Then
                                                            radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\OhGod.ogg"), $01)
                                                            radiostate[$04] = (radiostate[$04] + 1.0)
                                                            radiostate3[$00] = $01
                                                        EndIf
                                                    EndIf
                                                Case 100.0
                                                    If (radiostate3[$01] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Chatter1.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$01] = $01
                                                    EndIf
                                                Case 158.0
                                                    If (((0.0 = mtftimer) And (radiostate3[$02] = $00)) <> 0) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Franklin0.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate[$02] = 1.0
                                                    EndIf
                                                Case 200.0
                                                    If (radiostate3[$03] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Chatter3.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$03] = $01
                                                    EndIf
                                                Case 260.0
                                                    If (radiostate3[$04] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\035Help0.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$04] = $01
                                                    EndIf
                                                Case 300.0
                                                    If (radiostate3[$05] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Chatter0.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$05] = $01
                                                    EndIf
                                                Case 350.0
                                                    If (radiostate3[$06] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Franklin1.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$06] = $01
                                                    EndIf
                                                Case 400.0
                                                    If (radiostate3[$07] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\035Help1.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$07] = $01
                                                    EndIf
                                                Case 450.0
                                                    If (radiostate3[$08] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Franklin2.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$08] = $01
                                                    EndIf
                                                Case 600.0
                                                    If (radiostate3[$09] = $00) Then
                                                        radiochn[$04] = GUESSEDplaychannel_4(loadtempsound("SFX\Radio\Franklin3.ogg"), $01)
                                                        radiostate[$04] = (radiostate[$04] + 1.0)
                                                        radiostate3[$09] = $01
                                                    EndIf
                                            End Select
                                        EndIf
                                    EndIf
                                Default
                                    If (ChannelPlaying(radiochn[$06]) <> 0) Then
                                        StopChannel(radiochn[$06])
                                        radiochn[$06] = $00
                                    EndIf
                                    If (ChannelPlaying(radiochn[$05]) = $00) Then
                                        radiochn[$05] = GUESSEDplaychannel_4(snd_i\Field20, $00)
                                    EndIf
                            End Select
                            If (ChannelPlaying(radiochn[(Int min((local87\Field3 / 100.0), 5.0))]) = $00) Then
                                ResumeChannel(radiochn[(Int min((local87\Field3 / 100.0), 5.0))])
                            EndIf
                        EndIf
                        If (local5 = $00) Then
                            If (40.0 > local87\Field15) Then
                                If (70.0 <= batmsgtimer) Then
                                    If (ChannelPlaying(lowbatterychn[$00]) = $00) Then
                                        XZ0260X8X2\Field68 = max(4.0, XZ0260X8X2\Field68)
                                        lowbatterychn[$00] = GUESSEDplaychannel_4(snd_i\Field4[$00], $00)
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                ElseIf (((0.0 = local87\Field39) And (0.0 < local87\Field3)) <> 0) Then
                    If (local87\Field6\Field25 <> $00) Then
                        freeimage(local87\Field6\Field25)
                        local87\Field6\Field25 = $00
                    EndIf
                    For local9 = $00 To $06 Step $01
                        If (ChannelPlaying(radiochn[local9]) <> 0) Then
                            StopChannel(radiochn[local9])
                            radiochn[local9] = $00
                        EndIf
                    Next
                    createhintmsg(getlocalstring("msg", "bat.combine"), 6.0, $00)
                    local87\Field39 = 1.0
                EndIf
            Case $49,$4B,$4C,$4A
                local5 = (local87\Field6\Field9 = $4C)
                If (local5 = $00) Then
                    local87\Field15 = max(0.0, (local87\Field15 - (fps\Field3[$00] * (((Float (local87\Field6\Field9 = $49)) * 0.0035) + 0.0035))))
                EndIf
                If (((0.0 < local87\Field15) Lor local5) <> 0) Then
                    If (local87\Field6\Field25 = $00) Then
                        local87\Field6\Field2 = "GFX\Items\HUD Textures\navigator_off.png"
                        local87\Field6\Field25 = GUESSEDscaleresize_2(loadimage_strict(local87\Field6\Field2), (434.0 * menuscale), (509.0 * menuscale), $01)
                        local87\Field6\Field3 = (imagewidth(local87\Field6\Field25) Sar $01)
                        local87\Field6\Field4 = (imageheight(local87\Field6\Field25) Sar $01)
                    EndIf
                    If (((local5 = $00) And (20.0 > local87\Field15)) <> 0) Then
                        If (70.0 <= batmsgtimer) Then
                            If (ChannelPlaying(lowbatterychn[$00]) = $00) Then
                                XZ0260X8X2\Field68 = max(4.0, XZ0260X8X2\Field68)
                                lowbatterychn[$00] = playsound_strict(snd_i\Field4[$00], $00, $00)
                            EndIf
                        EndIf
                    EndIf
                ElseIf (0.0 = local87\Field39) Then
                    If (local87\Field6\Field25 <> $00) Then
                        freeimage(local87\Field6\Field25)
                        local87\Field6\Field25 = $00
                    EndIf
                    local87\Field39 = 1.0
                    createhintmsg(getlocalstring("msg", "bat.combine"), 6.0, $00)
                EndIf
            Case $75
                If (local87\Field6\Field25 = $00) Then
                    local87\Field6\Field25 = createimage($01, $01, $01, $00)
                    local87\Field15 = 1.0
                EndIf
                local87\Field15 = min(((rnd(0.002, 0.0027) * fps\Field3[$00]) + local87\Field15), 2.0)
            Case $69
                If (0.0 = local87\Field15) Then
                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\NostalgiaCancer" + (Str rand($05, $09))) + ".ogg")), $00, $00)
                    createmsg(getlocalstring("msg", "lostkey"), 6.0)
                    local87\Field15 = 1.0
                EndIf
            Case $6B
                If (0.0 = local87\Field15) Then
                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\NostalgiaCancer" + (Str rand($00, $04))) + ".ogg")), $00, $00)
                    local87\Field15 = 1.0
                EndIf
        End Select
    EndIf
    If ((local21 And (invopen = $00)) <> 0) Then
        movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
    EndIf
    catcherrors("Uncaught: UpdateGUI()")
    Return $00
End Function
