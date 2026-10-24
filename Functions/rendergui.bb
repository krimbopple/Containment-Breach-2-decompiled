Function rendergui%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8#
    Local local9%
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19%
    Local local20%
    Local local21%
    Local local22%
    Local local23$
    Local local24#
    Local local25#
    Local local26%
    Local local27%
    Local local28%
    Local local29%
    Local local30#
    Local local31#
    Local local32#
    Local local33#
    Local local34%
    Local local35%
    Local local36%
    Local local37%
    Local local38%
    Local local39%
    Local local40%
    Local local41%
    Local local43%
    Local local45$
    Local local46.T24B4ZF6F6
    Local local47%
    Local local48%
    Local local50.items
    Local local53%
    Local local54%
    Local local55%
    Local local56%
    Local local57%
    Local local58%
    Local local59%
    Local local60%
    Local local61%
    Local local62#
    Local local63#
    Local local64%
    Local local65%
    Local local66%
    Local local67%
    Local local68%
    Local local69%
    Local local70%
    Local local71%
    Local local72%
    Local local73#
    Local local74#
    Local local75%
    Local local76#
    Local local77.npcs
    Local local78.rooms
    Local local79%
    Local local80%
    Local local81%
    catcherrors("RenderGUI()")
    If (((((((menuopen Lor invopen) Lor consoleopen) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) <> 0) Then
        showpointer()
    Else
        hidepointer()
    EndIf
    If (((pd_event <> Null) And (pd_event\Field19 = playerroom)) <> 0) Then
        If ((((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) And (5.0 <> pd_event\Field7)) <> 0) Then
            If (pd_event\Field29 = $00) Then
                pd_event\Field29 = scaleimageex(loadimage_strict("GFX\Overlays\scp_106_face_overlay.png"), menuscale, menuscale, $01)
            Else
                rand($136, $186)
                drawblock(pd_event\Field29, (Int ((Float TDD0Z6BXB6\Field9) - ((Float rand($122, $136)) * menuscale))), $00, $00)
            EndIf
        ElseIf (2.0 = pd_event\Field7) Then
            If (((-16.0 < XZ0260X8X2\Field53) And (-6.0 > XZ0260X8X2\Field53)) <> 0) Then
                If (pd_event\Field16 = $00) Then
                    pd_event\Field16 = scaleimageex(loadimage_strict("GFX\Overlays\kneel_mortal_overlay.png"), menuscale, menuscale, $01)
                Else
                    rand($136, $186)
                    drawblock(pd_event\Field16, (Int ((Float TDD0Z6BXB6\Field9) - ((Float rand($122, $136)) * menuscale))), $00, $00)
                EndIf
            EndIf
        EndIf
    ElseIf (((scribe_event <> Null) And (scribe_event\Field19 = playerroom)) <> 0) Then
        If (0.36 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(scribe_event\Field19\Field27[$00], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(scribe_event\Field19\Field27[$00], $01, 1.0), 0.0, 0.0)) Then
            If (((70.0 > scribe_event\Field7) And (1.0 = scribe_event\Field1)) <> 0) Then
                XZ0260X8X2\Field53 = -10.0
                If (scribe_event\Field29 = $00) Then
                    playsound_strict(snd_i\Field40[$0B], $00, $00)
                    scribe_event\Field29 = resizeimageex(loadimage_strict("GFX\Overlays\scp_012_overlay.png"), menuscale, menuscale, $01)
                Else
                    rand($136, $186)
                    drawblock(scribe_event\Field29, (Int ((Float TDD0Z6BXB6\Field9) - ((Float rand($122, $136)) * menuscale))), $00, $00)
                EndIf
            EndIf
        EndIf
    EndIf
    If ((i_294\Field4 And (0.1 < secondarylighton)) <> 0) Then
        render294()
    EndIf
    If (((selecteddifficulty\Field7 <> difficulties[$03]\Field7) And opt\Field68) <> 0) Then
        local25 = 1.0
        If (((((((((menuopen Lor invopen) Lor consoleopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor (Int XZ0260X8X2\Field48)) Lor TX6X48DXXDX) = $00) Then
            local26 = ((TXBD40D4Z22() = $00) And T8X2046020\Field1)
            If (d_i\Field15 <> $00) Then
                render3dhandicon($05, d_i\Field15, $FFFFFFFF)
                local26 = $00
            EndIf
            If (closestitem <> Null) Then
                render3dhandicon($06, $00, $FFFFFFFF)
                local26 = $00
            EndIf
            If (handentity <> $00) Then
                render3dhandicon($05, handentity, $FFFFFFFF)
                For local7 = $00 To $03 Step $01
                    If (drawarrowicon[local7] <> 0) Then
                        render3dhandicon((local7 + $0A), handentity, local7)
                    EndIf
                Next
                local26 = $00
            EndIf
            If (local26 <> 0) Then
                local25 = 0.0
            EndIf
        EndIf
        renderhud(1.0)
    EndIf
    XZ0260X8X2\Field59 = TXX2F60Z0XB(local25, XZ0260X8X2\Field59, 4.0, TX8FF82X024())
    If (chs\Field4 <> $00) Then
        renderdebughud()
    EndIf
    If (((selectedscreen <> Null) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
        drawblock(selectedscreen\Field3, (Int ((Float TDD0Z6BXB6\Field9) - (384.0 * menuscale))), $00, $00)
    EndIf
    local27 = invopen
    local28 = $42
    local29 = $01
    If (d_i\Field3 <> Null) Then
        If (selecteditem <> Null) Then
            If ((((selecteditem\Field6\Field9 = $06) Lor (selecteditem\Field6\Field9 = $07)) Lor (selecteditem\Field6\Field9 = $08)) <> 0) Then
                local29 = $00
            EndIf
        EndIf
        If ((local29 And (d_i\Field15 <> $00)) <> 0) Then
            local30 = entityx(d_i\Field15, $01, 1.0)
            local31 = entityy(d_i\Field15, $01, 1.0)
            local32 = entityz(d_i\Field15, $01, 1.0)
            camerazoom(camera, (min(((XZ0260X8X2\Field51 / 400.0) + 1.0), 1.1) / camerazoomvalue))
            local19 = createpivot($00)
            positionentity(local19, local30, local31, local32, $00)
            rotateentity(local19, 0.0, (entityyaw(d_i\Field15, $01, 1.0) - 180.0), 0.0, $00)
            moveentity(local19, 0.0, 0.0, 0.22, $00)
            positionentity(camera, entityx(local19, $00, 1.0), entityy(local19, $00, 1.0), entityz(local19, $00, 1.0), $00)
            pointentity(camera, d_i\Field15, 0.0)
            freeentity(local19)
            local19 = $00
            local18 = (meshheight(d_i\Field8[$00]) * 0.015)
            cameraproject(camera, local30, (local31 + local18), local32, $01)
            local17 = projectedy()
            cameraproject(camera, local30, (local31 - local18), local32, $01)
            local18 = ((projectedy() - local17) / (462.0 * menuscale))
            local33 = (local18 / 2.0)
            local4 = (Int ((Float TDD0Z6BXB6\Field6) - ((Float imagewidth(X2Z260BF0Z\Field4[$04])) * local33)))
            local5 = (Int ((Float TDD0Z6BXB6\Field9) - ((Float imageheight(X2Z260BF0Z\Field4[$04])) * local33)))
            setfontex(XD00026ZX2\Field0[$02])
            color($FF, $FF, $FF, $FF)
            If (msg\Field7 <> "") Then
                If (35.0 > (msg\Field5 Mod 70.0)) Then
                    textex(TDD0Z6BXB6\Field6, (Int (((124.0 * menuscale) * local18) + (Float local5))), msg\Field7, $01, $01)
                EndIf
            Else
                textex(TDD0Z6BXB6\Field6, (Int (((70.0 * menuscale) * local18) + (Float local5))), getlocalstring("msg", "accesscode"), $01, $01)
                setfontex(XD00026ZX2\Field0[$03])
                textex(TDD0Z6BXB6\Field6, (Int (((124.0 * menuscale) * local18) + (Float local5))), msg\Field6, $01, $01)
            EndIf
            rendercursor()
        EndIf
    EndIf
    local36 = (Int (70.0 * menuscale))
    local37 = (Int (35.0 * menuscale))
    local38 = (Int ((64.0 * menuscale) / 2.0))
    local39 = (maxitemamount Sar $01)
    If (otheropen <> Null) Then
        local40 = $00
        local4 = (TDD0Z6BXB6\Field6 - ((((local36 * $0A) Sar $01) + (local37 Shl $02)) Sar $01))
        local5 = ((TDD0Z6BXB6\Field9 - ((((otheropen\Field36 / $0A) Shl $01) - $01) * local36)) - local37)
        local34 = $FFFFFFFF
        For local20 = $00 To (otheropen\Field36 - $01) Step $01
            If (mouseon(local4, local5, local36, local36) <> 0) Then
                local34 = local20
            EndIf
            If (otheropen\Field8[local20] <> Null) Then
                local41 = $00
                color($C8, $C8, $C8, $FF)
                Select otheropen\Field8[local20]\Field6\Field9
                    Case $38
                        local41 = (T8660BZ460\Field3 = $01)
                    Case $39
                        local41 = (T8660BZ460\Field3 = $02)
                    Case $3A
                        local41 = (T8660BZ460\Field3 = $03)
                    Case $3B
                        local41 = (T8660BZ460\Field3 = $04)
                    Case $7E
                        local41 = (T8660BZ460\Field4 = $01)
                    Case $22
                        local41 = (i_1499\Field8 = $01)
                    Case $23
                        local41 = (i_1499\Field8 = $02)
                    Case $40
                        local41 = (T8660BZ460\Field8 = $01)
                    Case $41
                        local41 = (T8660BZ460\Field8 = $02)
                    Case $42
                        local41 = (T8660BZ460\Field8 = $03)
                    Case $43
                        local41 = (T8660BZ460\Field11 = $01)
                    Case $44
                        local41 = (T8660BZ460\Field11 = $02)
                    Case $26
                        local41 = (T8660BZ460\Field7 = $01)
                    Case $74
                        local41 = (T8660BZ460\Field7 = $02)
                    Case $0B
                        local41 = (i_268\Field2 = $01)
                    Case $0C
                        local41 = (i_268\Field2 = $02)
                    Case $0D
                        local41 = (i_268\Field2 = $03)
                    Case $27
                        local41 = (T8660BZ460\Field6 = $01)
                    Case $28
                        local41 = (T8660BZ460\Field6 = $02)
                    Case $3C
                        local41 = (T8660BZ460\Field10 = $01)
                    Case $3D
                        local41 = (T8660BZ460\Field10 = $02)
                    Case $3E
                        local41 = (T8660BZ460\Field10 = $03)
                    Case $3F
                        local41 = (T8660BZ460\Field10 = $04)
                    Case $12
                        local41 = i_427\Field2
                    Case $19
                        local41 = (i_714\Field0 = $02)
                    Case $18
                        local41 = (i_714\Field0 = $01)
                    Default
                        If (TX8BXZD868F() = otheropen\Field8[local20]) Then
                            local41 = $01
                        EndIf
                End Select
                If (local41 <> 0) Then
                    rect((Int ((Float local4) - (3.0 * menuscale))), (Int ((Float local5) - (3.0 * menuscale))), eax_018A, eax_0109, eax_008D, eax_0050)
                EndIf
            EndIf
            If (local34 = local20) Then
                local28 = local20
                color($FF, $00, $00, $FF)
                rect((local4 - $01), (local5 - $01), (Int ((2.0 * menuscale) + (Float local36))), (Int ((2.0 * menuscale) + (Float local36))), $01)
            EndIf
            renderframe(local4, local5, local36, local36, (local4 Mod $40), (local4 Mod $40), $00, $01)
            If (otheropen\Field8[local20] <> Null) Then
                If (((local34 = local20) Lor (selecteditem <> otheropen\Field8[local20])) <> 0) Then
                    drawblock((Int ((Float ((local36 Sar $01) + local4)) - (32.0 * menuscale))), (Int ((Float ((local36 Sar $01) + local5)) - (32.0 * menuscale))), $00, $00)
                EndIf
            EndIf
            If (((otheropen\Field8[local20] <> Null) And (selecteditem <> otheropen\Field8[local20])) <> 0) Then
                If (local34 = local20) Then
                    setfontex(XD00026ZX2\Field0[$00])
                    color($FF, $FF, $FF, $FF)
                    textex(((local36 Sar $01) + local4), (Int ((Float ((local5 + local36) + local37)) - (15.0 * menuscale))), otheropen\Field8[local20]\Field6\Field24, $01, $00)
                EndIf
            EndIf
            local4 = ((local4 + local36) + local37)
            local40 = (local40 + $01)
            If (local40 = $05) Then
                local40 = $00
                local5 = (local5 + (local36 Shl $01))
                local4 = (TDD0Z6BXB6\Field6 - ((((local36 * $0A) Sar $01) + (local37 Shl $02)) Sar $01))
            EndIf
        Next
        If (selecteditem <> Null) Then
            If (TDD0Z6BXB6\Field1 <> 0) Then
                If (((local28 = $42) Lor (selecteditem <> otheropen\Field8[local28])) <> 0) Then
                    drawblock(selecteditem\Field20, (Int (mouseposx - (Float local38))), $00, $00)
                    If (local34 = $FFFFFFFF) Then
                        renderbar(blinkmeterimg, (Int (mouseposx - (Float local38))), (Int ((mouseposy - (Float local38)) - (15.0 * menuscale))), imagewidth(selecteditem\Field20), (Int (7.0 * menuscale)), XZ0260X8X2\Field84, 1.0, $96, $96, $96, $00)
                        If (XZ0260X8X2\Field35 = $00) Then
                            XZ0260X8X2\Field84 = blitz_TX006X4ZF080(1.0, XZ0260X8X2\Field84, 0.008, TX8FF82X024())
                            If (1.0 = XZ0260X8X2\Field84) Then
                                XZ0260X8X2\Field35 = $01
                            EndIf
                        Else
                            XZ0260X8X2\Field84 = blitz_TX006X4ZF080(0.0, XZ0260X8X2\Field84, 0.008, TX8FF82X024())
                            If (0.0 = XZ0260X8X2\Field84) Then
                                XZ0260X8X2\Field35 = $00
                            EndIf
                        EndIf
                    Else
                        XZ0260X8X2\Field84 = 0.0
                        XZ0260X8X2\Field35 = $00
                    EndIf
                EndIf
            EndIf
        Else
            XZ0260X8X2\Field84 = 0.0
            XZ0260X8X2\Field35 = $00
        EndIf
        rendercursor()
    ElseIf (invopen <> 0) Then
        local4 = (TDD0Z6BXB6\Field6 - (((local36 * local39) + ((local39 - $01) * local37)) Sar $01))
        local5 = ((TDD0Z6BXB6\Field9 - local36) - local37)
        If (maxitemamount = $02) Then
            local5 = (local5 + local36)
            local4 = (local4 - (((local36 * local39) + local37) Sar $01))
        EndIf
        local34 = $FFFFFFFF
        local43 = $00
        For local20 = $00 To (maxitemamount - $01) Step $01
            If (mouseon(local4, local5, local36, local36) <> 0) Then
                local34 = local20
            EndIf
            If (TX60DB8XBBZ(local20) <> Null) Then
                local41 = $00
                color($C8, $C8, $C8, $FF)
                Select TX60DB8XBBZ(local20)\Field6\Field9
                    Case $38
                        local41 = (T8660BZ460\Field3 = $01)
                    Case $39
                        local41 = (T8660BZ460\Field3 = $02)
                    Case $3A
                        local41 = (T8660BZ460\Field3 = $03)
                    Case $3B
                        local41 = (T8660BZ460\Field3 = $04)
                    Case $7E
                        local41 = (T8660BZ460\Field4 = $01)
                    Case $22
                        local41 = (i_1499\Field8 = $01)
                    Case $23
                        local41 = (i_1499\Field8 = $02)
                    Case $40
                        local41 = (T8660BZ460\Field8 = $01)
                    Case $41
                        local41 = (T8660BZ460\Field8 = $02)
                    Case $42
                        local41 = (T8660BZ460\Field8 = $03)
                    Case $43
                        local41 = (T8660BZ460\Field11 = $01)
                    Case $44
                        local41 = (T8660BZ460\Field11 = $02)
                    Case $26
                        local41 = (T8660BZ460\Field7 = $01)
                    Case $74
                        local41 = (T8660BZ460\Field7 = $02)
                    Case $0B
                        local41 = (i_268\Field2 = $01)
                    Case $0C
                        local41 = (i_268\Field2 = $02)
                    Case $0D
                        local41 = (i_268\Field2 = $03)
                    Case $27
                        local41 = (T8660BZ460\Field6 = $01)
                    Case $28
                        local41 = (T8660BZ460\Field6 = $02)
                    Case $3C
                        local41 = (T8660BZ460\Field10 = $01)
                    Case $3D
                        local41 = (T8660BZ460\Field10 = $02)
                    Case $3E
                        local41 = (T8660BZ460\Field10 = $03)
                    Case $3F
                        local41 = (T8660BZ460\Field10 = $04)
                    Case $12
                        local41 = i_427\Field2
                    Case $19
                        local41 = (i_714\Field0 = $02)
                    Case $18
                        local41 = (i_714\Field0 = $01)
                    Default
                        If (TX8BXZD868F() = TX60DB8XBBZ(local20)) Then
                            local41 = $01
                        EndIf
                End Select
                If (local41 <> 0) Then
                    rect((Int ((Float local4) - (3.0 * menuscale))), (Int ((Float local5) - (3.0 * menuscale))), eax_0355, ebx_014E, $01)
                EndIf
            EndIf
            If (0.0 < i_1025\Field1[$00]) Then
                If (((local20 = (maxitemamount - $01)) Lor (local20 = (local39 - $01))) <> 0) Then
                    color($00, $FF, $00, $FF)
                    rect((local4 - $01), (local5 - $01), (Int ((2.0 * menuscale) + (Float local36))), (Int ((2.0 * menuscale) + (Float local36))), $01)
                EndIf
            EndIf
            If (local34 = local20) Then
                local28 = local20
                color($FF, $00, $00, $FF)
                rect((local4 - $01), (local5 - $01), (Int ((2.0 * menuscale) + (Float local36))), (Int ((2.0 * menuscale) + (Float local36))), $01)
            EndIf
            color($FF, $FF, $FF, $FF)
            renderframe(local4, local5, local36, local36, (local4 Mod $40), (local4 Mod $40), $00, $01)
            If (TX60DB8XBBZ(local20) <> Null) Then
                If (((local34 = local20) Lor (selecteditem <> TX60DB8XBBZ(local20))) <> 0) Then
                    drawimage(TX60DB8XBBZ(local20)\Field20, (Int ((Float ((local36 Sar $01) + local4)) - (32.0 * menuscale))), $00, $00)
                EndIf
            EndIf
            If ((((local20 <= $04) And (X4BX024DX0() <> $00)) And T8X2046020\Field22) <> 0) Then
                renderframe(local4, local5, (Int ((Float local36) * 0.2)), (Int ((Float local36) * 0.2)), (local4 Mod $40), (local4 Mod $40), $00, $01)
                setfontex(XD00026ZX2\Field0[$0D])
                textex((Int ((((Float local36) * 0.2) / 2.0) + (Float local4))), (Int ((((Float local36) * 0.2) / 2.0) + (Float local5))), (Str (local20 + $01)), $01, $01)
                setfontex(XD00026ZX2\Field0[$00])
            EndIf
            If (((TX60DB8XBBZ(local20) <> Null) And (selecteditem <> TX60DB8XBBZ(local20))) <> 0) Then
                If ((((0.0 = i_409\Field0) And (i_427\Field2 = $00)) And (TX60DB8XBBZ(local20)\Field6\Field9 = $08)) <> 0) Then
                    XZ0260X8X2\Field64 = max(1000.0, XZ0260X8X2\Field64)
                    i_409\Field0 = 0.001
                EndIf
                If (local34 = local20) Then
                    If (selecteditem = Null) Then
                        setfontex(XD00026ZX2\Field0[$00])
                        color($FF, $FF, $FF, $FF)
                        local45 = ""
                        If (((TX60DB8XBBZ(local20)\Field6\Field11 > $00) And ((0.0 < TX60DB8XBBZ(local20)\Field15) Lor (0.0 < TX60DB8XBBZ(local20)\Field3))) <> 0) Then
                            local46 = X4DZBDB0DZ(TX60DB8XBBZ(local20)\Field6\Field11)
                            If ((((local46 <> Null) And (local46\Field3\Field26 = $00)) And (local46\Field3\Field42 = $00)) <> 0) Then
                                local45 = ((((" (" + (Str (Int TX60DB8XBBZ(local20)\Field15))) + "/") + (Str (Int TX60DB8XBBZ(local20)\Field3))) + ")")
                            EndIf
                        EndIf
                        textex(((local36 Sar $01) + local4), (Int ((Float ((local5 + local36) + local37)) - (15.0 * menuscale))), (TX60DB8XBBZ(local20)\Field24 + local45), $01, $00)
                    EndIf
                EndIf
            EndIf
            local4 = ((local4 + local36) + local37)
            If (((maxitemamount >= $04) And (local20 = (local39 - $01))) <> 0) Then
                local5 = (local5 + (local36 Shl $01))
                local4 = (TDD0Z6BXB6\Field6 - (((local36 * local39) + ((local39 - $01) * local37)) Sar $01))
            EndIf
        Next
        rendermenuinputboxes()
        rendermenubuttons()
        If (selecteditem <> Null) Then
            If (TDD0Z6BXB6\Field1 <> 0) Then
                If (((local28 = $42) Lor (selecteditem <> TX60DB8XBBZ(local28))) <> 0) Then
                    drawblock(selecteditem\Field20, (Int (mouseposx - (Float local38))), $00, $00)
                    If (local34 = $FFFFFFFF) Then
                        renderbar(blinkmeterimg, (Int (mouseposx - (Float local38))), (Int ((mouseposy - (Float local38)) - (15.0 * menuscale))), imagewidth(selecteditem\Field20), (Int (7.0 * menuscale)), XZ0260X8X2\Field84, 1.0, $96, $96, $96, $00)
                        If (XZ0260X8X2\Field35 = $00) Then
                            XZ0260X8X2\Field84 = blitz_TX006X4ZF080(1.0, XZ0260X8X2\Field84, 0.008, TX8FF82X024())
                            If (1.0 = XZ0260X8X2\Field84) Then
                                XZ0260X8X2\Field35 = $01
                            EndIf
                        Else
                            XZ0260X8X2\Field84 = blitz_TX006X4ZF080(0.0, XZ0260X8X2\Field84, 0.008, TX8FF82X024())
                            If (0.0 = XZ0260X8X2\Field84) Then
                                XZ0260X8X2\Field35 = $00
                            EndIf
                        EndIf
                    Else
                        XZ0260X8X2\Field84 = 0.0
                        XZ0260X8X2\Field35 = $00
                    EndIf
                EndIf
            EndIf
        Else
            XZ0260X8X2\Field84 = 0.0
            XZ0260X8X2\Field35 = $00
        EndIf
        rendercursor()
    ElseIf (selecteditem <> Null) Then
        local47 = (Int (300.0 * menuscale))
        local48 = (Int (20.0 * menuscale))
        Select selecteditem\Field6\Field9
            Case $38,$39,$3A,$3B,$7E,$22,$23,$26,$74,$0B,$0C,$0D
                If (0.0 < selecteditem\Field15) Then
                    drawblock(selecteditem\Field6\Field14, (TDD0Z6BXB6\Field6 - local38), $00, $00)
                    local4 = (TDD0Z6BXB6\Field6 - (local47 Sar $01))
                    local5 = (Int ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale)))
                    renderbar(blinkmeterimg, local4, local5, local47, local48, selecteditem\Field15, 100.0, $96, $96, $96, $00)
                EndIf
            Case $40,$41,$42,$43,$44,$30,$31,$32,$33,$37,$55,$56,$57,$58
                If (0.0 < selecteditem\Field39) Then
                    drawblock(selecteditem\Field6\Field14, (TDD0Z6BXB6\Field6 - local38), $00, $00)
                    local4 = (TDD0Z6BXB6\Field6 - (local47 Sar $01))
                    local5 = (Int ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale)))
                    renderbar(blinkmeterimg, local4, local5, local47, local48, selecteditem\Field39, 100.0, $96, $96, $96, $00)
                EndIf
            Case $3C,$3D,$3E,$3F,$27,$28
                drawblock(selecteditem\Field6\Field14, (TDD0Z6BXB6\Field6 - local38), $00, $00)
                local4 = (TDD0Z6BXB6\Field6 - (local47 Sar $01))
                local5 = (Int ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale)))
                renderbar(blinkmeterimg, local4, local5, local47, local48, selecteditem\Field15, 100.0, $96, $96, $96, $00)
            Case $34,$36,$35,$7D
                If (0.0 < selecteditem\Field15) Then
                    eax_0687 = (TDD0Z6BXB6\Field9 - local38)
                    drawblock(selecteditem\Field6\Field14, (TDD0Z6BXB6\Field6 - local38), $00, $00)
                    local4 = (TDD0Z6BXB6\Field6 - (local47 Sar $01))
                    local5 = (Int ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale)))
                    renderbar(blinkmeterimg, local4, local5, local47, local48, selecteditem\Field15, 100.0, $96, $96, $96, $00)
                EndIf
            Case $2B
                If (0.0 < selecteditem\Field39) Then
                    eax_06AF = (TDD0Z6BXB6\Field9 - local38)
                    drawblock(selecteditem\Field6\Field14, (TDD0Z6BXB6\Field6 - local38), $00, $00)
                    local4 = (TDD0Z6BXB6\Field6 - (local47 Sar $01))
                    local5 = (Int ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale)))
                    renderbar(blinkmeterimg, local4, local5, local47, local48, selecteditem\Field39, 100.0, $96, $96, $96, $00)
                EndIf
            Case $00,$01,$1E,$1F,$03
                If (((selecteditem\Field6\Field25 <> $00) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
                    eax_06EE = (TDD0Z6BXB6\Field6 - selecteditem\Field6\Field3)
                    drawblock(selecteditem\Field6\Field25, (TDD0Z6BXB6\Field9 - selecteditem\Field6\Field4), $00, $00)
                EndIf
            Case $04,$05
                If (((selecteditem\Field6\Field25 <> $00) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
                    eax_072F = (TDD0Z6BXB6\Field6 - selecteditem\Field6\Field3)
                    drawimage(selecteditem\Field6\Field25, (TDD0Z6BXB6\Field9 - selecteditem\Field6\Field4), $00, $00)
                EndIf
            Case $4D,$4E,$4F
                If (((selecteditem\Field6\Field25 <> $00) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
                    local4 = (TDD0Z6BXB6\Field6 - selecteditem\Field6\Field3)
                    local5 = (TDD0Z6BXB6\Field9 - selecteditem\Field6\Field4)
                    eax_0787 = selecteditem\Field6\Field25
                    drawimage(local4, local5, $00, $00)
                    local3 = (0.0 < selecteditem\Field15)
                    If (((local3 Lor (selecteditem\Field6\Field9 = $4F)) And ((16.0 < coffindistance) Lor (coffindistance > rnd(16.0, 0.0)))) <> 0) Then
                        If (local3 <> 0) Then
                            local20 = (Int min(ceil((selecteditem\Field15 / 10.0)), 10.0))
                            color((((local20 < $03) * $AA) + $1E), ((local20 < $03) * $1E), ((local20 < $03) * $1E), $FF)
                            rect((Int ((406.0 * menuscale) + (Float local4))), eax_0787, (Int (80.0 * menuscale)), eax_072F, eax_06EE, eax_06AF)
                            For local7 = $01 To local20 Step $01
                                rect((Int ((((Float (local7 Shl $03)) * menuscale) + (Float local4)) + (400.0 * menuscale))), (Int ((94.0 * menuscale) + (Float local5))), (Int (4.0 * menuscale)), (Int (12.0 * menuscale)), $01, eax_0687)
                            Next
                        EndIf
                        color($1E, $1E, $1E, $FF)
                        rect((Int ((58.0 * menuscale) + (Float local4))), (Int ((114.0 * menuscale) + (Float local5))), (Int (434.0 * menuscale)), (Int menuscale), $00, eax_065F)
                        If (0.0 = selecteditem\Field3) Then
                            If ((millisec Mod $320) < $C8) Then
                                setfont(XD00026ZX2\Field0[$02])
                                textex(TDD0Z6BXB6\Field6, (Int ((Float TDD0Z6BXB6\Field9) - (100.0 * menuscale))), getlocalstring("msg", "e.reader.welcome"), $01, $01)
                                setfont(XD00026ZX2\Field0[$00])
                            EndIf
                        Else
                            textex((Int ((70.0 * menuscale) + (Float local4))), (Int ((94.0 * menuscale) + (Float local5))), (((Str (Int selecteditem\Field3)) + "/") + (Str selecteditem\Field32)), $00, $00)
                            If (selecteditem\Field6\Field15 <> $00) Then
                                eax_081A = (TDD0Z6BXB6\Field6 - selecteditem\Field6\Field17)
                                drawblock(selecteditem\Field6\Field15, (Int ((Float (TDD0Z6BXB6\Field9 - selecteditem\Field6\Field18)) - (12.0 * menuscale))), $00, $00)
                            EndIf
                        EndIf
                    EndIf
                EndIf
        End Select
    EndIf
    If (TX8BXZD868F() <> Null) Then
        local50 = TX8BXZD868F()
        Select local50\Field6\Field9
            Case $45,$46,$47,$48
                setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                local23 = ""
                local4 = (opt\Field21 - local50\Field6\Field3)
                local5 = (opt\Field46 - local50\Field6\Field4)
                color($00, $00, $00, $FF)
                rect((Int ((Float local4) - (10.0 * menuscale))), (Int ((Float local5) - (30.0 * menuscale))), eax_081A, (Int (110.0 * menuscale)), $01, eax_063D)
                If (((local50\Field6\Field25 <> $00) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
                    If ((((((0.0 < local50\Field15) And (0.0 < local50\Field3)) Lor (local50\Field6\Field9 = $47)) Lor (local50\Field6\Field9 = $48)) And ((16.0 < coffindistance) Lor (coffindistance > rnd(16.0, 0.0)))) <> 0) Then
                        If (((playerroom\Field22\Field21 <> $6F) And (8.0 <= coffindistance)) <> 0) Then
                            eax_08CE = local50\Field6\Field25
                            drawimage(local4, local5, $00, $00)
                            Select (Int (local50\Field3 / 100.0))
                                Case $01
                                    If (opt\Field81 = $00) Then
                                        local23 = format(getlocalstring("radio", "usertrack"), getlocalstring("radio", "notenable"), "%s")
                                    ElseIf (usertrackmusicamount < $01) Then
                                        local23 = format(getlocalstring("radio", "usertrack"), getlocalstring("radio", "nofound"), "%s")
                                    ElseIf (ChannelPlaying(radiochn[$00]) <> 0) Then
                                        local23 = format(getlocalstring("radio", "usertrack"), upper(usertrackname[(Int radiostate[$00])]), "%s")
                                    EndIf
                                Case $02
                                    local23 = getlocalstring("radio", "warn")
                                Case $03
                                    local23 = getlocalstring("radio", "onsite")
                                Case $04
                                    local23 = getlocalstring("radio", "emergency")
                            End Select
                            local4 = (Int ((45.0 * menuscale) + (Float local4)))
                            local5 = (Int ((345.0 * menuscale) + (Float local5)))
                            If (((local50\Field6\Field9 = $45) Lor (local50\Field6\Field9 = $46)) <> 0) Then
                                local20 = (Int ceil((local50\Field15 / 20.0)))
                                color((((local20 < $03) * $AA) + $1E), ((local20 < $03) * $1E), ((local20 < $03) * $1E), $FF)
                                For local7 = $00 To $04 Step $01
                                    rect(local4, eax_08CE, (Int ((43.0 * menuscale) - ((Float (local7 * $06)) * menuscale))), (Int (4.0 * menuscale)), (local20 > ($04 - local7)), eax_0615)
                                Next
                            EndIf
                            setfontex(XD00026ZX2\Field0[$02])
                            color($1E, $1E, $1E, $FF)
                            textex((Int ((50.0 * menuscale) + (Float local4))), local5, getlocalstring("radio", "chn"), $00, $00)
                            If (local50\Field6\Field9 = $48) Then
                                local23 = ""
                                For local7 = $00 To rand($05, $1E) Step $01
                                    local23 = (local23 + chr(rand($64, $01)))
                                Next
                                setfontex(XD00026ZX2\Field0[$02])
                                textex((Int ((50.0 * menuscale) + (Float local4))), (Int ((16.0 * menuscale) + (Float local5))), (Str rand($00, $09)), $00, $00)
                            Else
                                setfontex(XD00026ZX2\Field0[$02])
                                textex((Int ((50.0 * menuscale) + (Float local4))), (Int ((16.0 * menuscale) + (Float local5))), left((Str (local50\Field3 / 100.0)), $06), $00, $00)
                            EndIf
                            setfontex(XD00026ZX2\Field0[$02])
                            If (local23 <> "") Then
                                local23 = right(left(local23, ((millisec / $12C) Mod len(local23))), $0A)
                                textex((Int ((Float local4) - (28.0 * menuscale))), (Int ((33.0 * menuscale) + (Float local5))), (("          " + local23) + "          "), $00, $00)
                            EndIf
                            setfontex(XD00026ZX2\Field0[$00])
                        EndIf
                    EndIf
                EndIf
                copyrectstretch((Int ((Float local4) - (10.0 * menuscale))), (Int ((Float local5) - (30.0 * menuscale))), (Int (120.0 * menuscale)), (Int (110.0 * menuscale)), $00, $00, texturewidth(XF2ZXZ0884()), textureheight(XF2ZXZ0884()), texturebuffer(resizetexture, $00), texturebuffer(XF2ZXZ0884(), $00))
                setbuffer(backbuffer(), $00, $00)
            Case $49,$4A,$4B,$4C
                setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                local4 = (Int ((Float (opt\Field21 - local50\Field6\Field3)) + (20.0 * menuscale)))
                local5 = (Int ((Float (opt\Field46 - local50\Field6\Field4)) - (85.0 * menuscale)))
                local53 = (local4 - local50\Field6\Field3)
                local54 = (Int ((Float (local5 - local50\Field6\Field4)) + (85.0 * menuscale)))
                color($00, $00, $00, $FF)
                rect((Int ((70.0 * menuscale) + (Float local53))), (Int ((10.0 * menuscale) + (Float local54))), (Int (290.0 * menuscale)), (Int (320.0 * menuscale)), $01, ebx_0204)
                If (((local50\Field6\Field25 <> $00) And (-6.0 < XZ0260X8X2\Field53)) <> 0) Then
                    setfontex(XD00026ZX2\Field0[$02])
                    local55 = ((local50\Field6\Field9 = $4A) Lor (local50\Field6\Field9 = $49))
                    local56 = (Int (287.0 * menuscale))
                    local57 = (Int (256.0 * menuscale))
                    local58 = (Int (24.0 * menuscale))
                    local59 = (local58 Sar $01)
                    local60 = (local56 Sar $01)
                    local61 = (local57 Sar $01)
                    If (((0.0 < local50\Field15) And ((playerinreachableroom($01, $00, $01) = $00) Lor (infacility <> $00))) <> 0) Then
                        If ((millisec Mod $320) < $C8) Then
                            drawimage(local50\Field6\Field25, (local4 - local50\Field6\Field3), $00, $00)
                            color($C8, $00, $00, $FF)
                            textex(local4, (Int ((Float (local5 + local61)) - (80.0 * menuscale))), getlocalstring("msg", "nav.error"), $01, $00)
                            textex(local4, (Int ((Float (local5 + local61)) - (60.0 * menuscale))), getlocalstring("msg", "nav.locunknown"), $01, $00)
                        EndIf
                    ElseIf (((((0.0 < local50\Field15) Lor (local50\Field6\Field9 = $4A)) Lor (local50\Field6\Field9 = $4C)) And ((16.0 < coffindistance) Lor (coffindistance > rnd(16.0, 0.0)))) <> 0) Then
                        ebx_03DA = (Int ((Float (local5 - local50\Field6\Field4)) + (85.0 * menuscale)))
                        drawimage(local50\Field6\Field25, (local4 - local50\Field6\Field3), $00, $00)
                        local62 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                        local63 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                        local64 = (Int floor(((local62 / 8.0) + 0.5)))
                        local65 = (Int floor(((local63 / 8.0) + 0.5)))
                        setbuffer(texturebuffer(X2Z260BF0Z\Field2, $00), $00, $00)
                        eax_0AF3 = local50\Field6\Field25
                        drawimage(local53, local54, $00, $00)
                        local4 = (Int ((((local62 - 4.0) Mod 8.0) * (3.0 * menuscale)) + ((Float local4) - (12.0 * menuscale))))
                        local5 = (Int (((12.0 * menuscale) + (Float local5)) - (((local63 - 4.0) Mod 8.0) * (3.0 * menuscale))))
                        local66 = (Int max(1.0, (Float (local64 - $06))))
                        local67 = (Int min((Float (X824BX6D68 - $01)), (Float (local64 + $06))))
                        local68 = (Int max(1.0, (Float (local65 - $06))))
                        local69 = (Int min((Float (X824BX6D68 - $01)), (Float (local65 + $06))))
                        For local11 = (Float local66) To (Float local67) Step 1.0
                            For local16 = (Float local68) To (Float local69) Step 1.0
                                local70 = (Int ((local16 * (Float X824BX6D68)) + local11))
                                If (((currmapgrid\Field4[local70] > $00) And ((currmapgrid\Field0[local70] > $00) Lor (local55 = $00))) <> 0) Then
                                    local71 = (Int ((((Float local64) - local11) * (Float local58)) + (Float local4)))
                                    local72 = (Int ((Float local5) - (((Float local65) - local16) * (Float local58))))
                                    color(((((local50\Field6\Field9 = $4C) And ((currmapgrid\Field4[local70] <= $00) Lor (currmapgrid\Field0[local70] <= $00))) * $AA) + $1E), $1E, $1E, $FF)
                                    If (currmapgrid\Field4[(Int ((local11 + 1.0) + (local16 * (Float X824BX6D68))))] = $00) Then
                                        rect((local71 - local59), eax_0AF3, $01, local58, ebx_03DA, ebx_03BA)
                                    EndIf
                                    If (currmapgrid\Field4[(Int ((local11 - 1.0) + (local16 * (Float X824BX6D68))))] = $00) Then
                                        rect((local71 + local59), (local72 - local59), $01, local58, $01, esi_00D0)
                                    EndIf
                                    If (currmapgrid\Field4[(Int (((local16 - 1.0) * (Float X824BX6D68)) + local11))] = $00) Then
                                        rect((local71 - local59), (local72 - local59), local58, $01, $01)
                                    EndIf
                                    If (currmapgrid\Field4[(Int (((local16 + 1.0) * (Float X824BX6D68)) + local11))] = $00) Then
                                        rect((local71 - local59), (local72 + local59), local58, $01, $01)
                                    EndIf
                                EndIf
                            Next
                        Next
                        setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                        color($FF, $FF, $FF, $FF)
                        drawbufferrect(texturebuffer(X2Z260BF0Z\Field2, $00), (Int ((80.0 * menuscale) + (Float local53))), (Int ((70.0 * menuscale) + (Float local54))), (Int (270.0 * menuscale)), (Int (230.0 * menuscale)), (Int ((80.0 * menuscale) + (Float local53))), (Int ((70.0 * menuscale) + (Float local54))), (Int (270.0 * menuscale)), (Int (230.0 * menuscale)), $01)
                        color((($AA * local55) + $1E), ($1E * local55), ($1E * local55), $FF)
                        rect((Int ((80.0 * menuscale) + (Float local53))), (Int ((70.0 * menuscale) + (Float local54))), (Int (270.0 * menuscale)), (Int (230.0 * menuscale)), $00)
                        local4 = (Int ((Float (opt\Field21 - local50\Field6\Field3)) + (20.0 * menuscale)))
                        local5 = (Int ((Float (opt\Field46 - local50\Field6\Field4)) - (85.0 * menuscale)))
                        If ((millisec Mod $320) < $C8) Then
                            If (local55 <> 0) Then
                                textex((Int ((10.0 * menuscale) + (Float (local4 - local60)))), (Int ((10.0 * menuscale) + (Float (local5 - local61)))), getlocalstring("msg", "nav.data"), $00, $00)
                            EndIf
                            local8 = (entityyaw(XZ0260X8X2\Field74, $00, 1.0) - 90.0)
                            local73 = (6.0 * menuscale)
                            local74 = (5.0 * menuscale)
                            local10 = ((cos(local8) * local73) + (Float local4))
                            local13 = ((Float local5) - (sin(local8) * local73))
                            local11 = ((cos((local8 - 140.0)) * local74) + (Float local4))
                            local14 = ((Float local5) - (sin((local8 - 140.0)) * local74))
                            local12 = ((cos((local8 + 140.0)) * local74) + (Float local4))
                            local15 = ((Float local5) - (sin((local8 + 140.0)) * local74))
                            line((Int local10), (Int local13), (Int local11), (Int local14))
                            line((Int local10), (Int local13), (Int local12), (Int local15))
                            line((Int local11), (Int local14), (Int local12), (Int local15))
                        EndIf
                        local75 = $00
                        If (local50\Field6\Field9 = $4C) Then
                            local79 = $00
                            local80 = $00
                            For local78 = Each rooms
                                local81 = local78\Field22\Field21
                                If (((((((local81 <> $04) And (local81 <> $4C)) And (local81 <> $4E)) And (local81 <> $72)) And (local81 <> $6F)) And (local81 <> $70)) <> 0) Then
                                    local79 = (local79 + $01)
                                    local80 = (local80 + local78\Field7)
                                EndIf
                            Next
                            textex((Int ((10.0 * menuscale) + (Float (local4 - local60)))), (Int ((10.0 * menuscale) + (Float (local5 - local61)))), (((Str local80) + "/") + (Str local79)), $00, $00)
                            If ((millisec Mod $258) < $190) Then
                                color($C8, $00, $00, $FF)
                                For local77 = Each npcs
                                    Select local77\Field77
                                        Case $08,$07,$06,$03,$05
                                            If (local77\Field22 = $00) Then
                                                local76 = entitydistancesquared(camera, local77\Field82)
                                                If (900.0 > local76) Then
                                                    local24 = sqr(local76)
                                                    T2XX60BD226((Int ((Float local4) - ((1.5 * menuscale) * local24))), (Int ((Float local5) - ((1.5 * menuscale) * local24))), (Int ((3.0 * menuscale) * local24)), (Int ((3.0 * menuscale) * local24)), $00)
                                                    textex((Int ((10.0 * menuscale) + (Float (local4 - local60)))), (Int (((30.0 * menuscale) + (Float (local5 - local61))) + ((Float ($14 * local75)) * menuscale))), local77\Field72, $00, $00)
                                                    local75 = (local75 + $01)
                                                EndIf
                                            EndIf
                                    End Select
                                Next
                                If (((playerroom\Field22\Field21 = $2D) And (8.0 > coffindistance)) <> 0) Then
                                    local76 = rnd(4.0, 8.0)
                                    T2XX60BD226((Int ((Float local4) - ((1.5 * menuscale) * local76))), (Int ((Float local5) - ((1.5 * menuscale) * local76))), (Int ((3.0 * menuscale) * local76)), (Int ((3.0 * menuscale) * local76)), $00)
                                    textex((Int ((10.0 * menuscale) + (Float (local4 - local60)))), (Int (((30.0 * menuscale) + (Float (local5 - local61))) + ((Float ($14 * local75)) * menuscale))), "SCP-895", $00, $00)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    If (((0.0 < local50\Field15) And ((local50\Field6\Field9 = $49) Lor (local50\Field6\Field9 = $4B))) <> 0) Then
                        local21 = (Int ((196.0 * menuscale) + (Float (local4 - local60))))
                        local22 = (Int ((10.0 * menuscale) + (Float (local5 - local61))))
                        local20 = (Int min(ceil((local50\Field15 / 10.0)), 10.0))
                        color((((local20 < $03) * $AA) + $1E), ((local20 < $03) * $1E), ((local20 < $03) * $1E), $FF)
                        rect(local21, local22, (Int (80.0 * menuscale)), (Int (20.0 * menuscale)), $00)
                        For local7 = $01 To local20 Step $01
                            rect((Int ((((Float (local7 Shl $03)) * menuscale) + (Float local21)) - (6.0 * menuscale))), (Int ((4.0 * menuscale) + (Float local22))), (Int (4.0 * menuscale)), (Int (12.0 * menuscale)), $01)
                        Next
                    EndIf
                    setfontex(XD00026ZX2\Field0[$00])
                EndIf
                copyrectstretch((Int ((71.0 * menuscale) + (Float local53))), (Int ((11.0 * menuscale) + (Float local54))), (Int (289.0 * menuscale)), (Int (319.0 * menuscale)), $00, $00, texturewidth(XF2ZXZ0884()), textureheight(XF2ZXZ0884()), texturebuffer(resizetexture, $00), texturebuffer(XF2ZXZ0884(), $00))
                setbuffer(backbuffer(), $00, $00)
            Case $75
                setbuffer(texturebuffer(resizetexture, $00), $00, $00)
                color($28, $32, $25, $FF)
                rect($00, $00, (Int (135.0 * menuscale)), (Int (135.0 * menuscale)), $01)
                color($00, $00, $00, $FF)
                setfontex(XD00026ZX2\Field0[$02])
                Select (Int floor(local50\Field15))
                    Case $01
                        local23 = "BOOTING..."
                    Case $02
                        local23 = "TARGET - SITE-XX ACCESS NODE - GRID B ENCRYPTION - SHA-512 FOUNDATION STANDARD"
                End Select
                If (local23 <> "") Then
                    local23 = right(left(local23, ((millisec / $12C) Mod len(local23))), $0F)
                    textex((Int (-40.0 * menuscale)), (Int ((67.5 * menuscale) - ((Float fontheight()) / 2.0))), (("          " + local23) + "          "), $00, $00)
                EndIf
                copyrectstretch($00, $00, (Int (135.0 * menuscale)), (Int (135.0 * menuscale)), $00, $00, texturewidth(XF2ZXZ0884()), textureheight(XF2ZXZ0884()), texturebuffer(resizetexture, $00), texturebuffer(XF2ZXZ0884(), $00))
                setbuffer(backbuffer(), $00, $00)
        End Select
    EndIf
    catcherrors("Uncaught: RenderGUI()")
    Return $00
End Function
