Function rendernvg%()
    Local local0.npcs
    Local local1%
    Local local2%
    Local local3%
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    Local local9#
    Local local10#
    Local local11#
    Local local12%
    Local local13$
    Local local14%
    If (((T8660BZ460\Field2 > $00) And ((-6.0 < XZ0260X8X2\Field53) Lor (-11.0 > XZ0260X8X2\Field53))) <> 0) Then
        If (T8660BZ460\Field11 = $02) Then
            color($64, $64, $64, $FF)
            setfontex(XD00026ZX2\Field0[$02])
            If (n_i\Field2 <> Null) Then
                If (n_i\Field2\Field93 <> 0) Then
                    textex(TDD0Z6BXB6\Field6, (Int (60.0 * menuscale)), getlocalstring("msg", "scramble.106.cont"), $01, $00)
                Else
                    textex(TDD0Z6BXB6\Field6, (Int (60.0 * menuscale)), format(getlocalstring("msg", "scramble.106.arr"), (Str (n_i\Field2\Field65 * (1.0 / 256.0))), "%s"), $01, $00)
                EndIf
            EndIf
            If (n_i\Field3 <> Null) Then
                local4 = distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), n_i\Field3\Field100, entityy(XZ0260X8X2\Field74, $01, 1.0), n_i\Field3\Field14, entityz(XZ0260X8X2\Field74, $01, 1.0), n_i\Field3\Field97)
                If (((256.0 > local4) And entityinview(n_i\Field3\Field82, camera)) <> 0) Then
                    cameraproject(camera, n_i\Field3\Field100, n_i\Field3\Field14, n_i\Field3\Field97, $01)
                    local5 = projectedx()
                    local6 = projectedy()
                    local7 = (Int (15.0 * menuscale))
                    local8 = (Int (50.0 * menuscale))
                    local9 = (16.0 / sqr(local4))
                    local10 = ((Float local7) * local9)
                    local11 = ((Float local8) * local9)
                    rect((Int (local5 - (local10 / 2.0))), (Int (local6 - (local11 / 2.0))), (Int local10), (Int local11), $00)
                EndIf
            EndIf
        ElseIf (T8660BZ460\Field8 = $02) Then
            color($64, $64, $FF, $FF)
            setfontex(XD00026ZX2\Field0[$02])
            local12 = $00
            local12 = $28
            local13 = getlocalstring("msg", "refresh")
            local14 = instr(local13, "%s", $01)
            textex(TDD0Z6BXB6\Field6, (Int (60.0 * menuscale)), trim(left(local13, (local14 - $01))), $01, $00)
            textex(TDD0Z6BXB6\Field6, (Int (100.0 * menuscale)), (Str max((Float floattostring((T8660BZ460\Field1 / 90.0), $01)), 0.0)), $01, $00)
            textex(TDD0Z6BXB6\Field6, (Int (140.0 * menuscale)), trim(right(local13, ((len(local13) - local14) - $01))), $01, $00)
            For local0 = Each npcs
                If (local0\Field22 = $00) Then
                    local4 = distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), local0\Field100, entityy(XZ0260X8X2\Field74, $01, 1.0), local0\Field14, entityz(XZ0260X8X2\Field74, $01, 1.0), local0\Field97)
                    If (400.0 > local4) Then
                        If (T8660BZ460\Field5 = $00) Then
                            cameraproject(camera, local0\Field100, (local0\Field14 + 0.5), local0\Field97, $01)
                            local5 = projectedx()
                            local6 = projectedy()
                            textex((Int local5), (Int local6), local0\Field72, $01, $01)
                            textex((Int local5), (Int (local6 - (25.0 * menuscale))), (floattostring(sqr(local4), $01) + " m"), $01, $01)
                        EndIf
                    EndIf
                EndIf
            Next
            color($00, $00, $37, $FF)
        ElseIf (T8660BZ460\Field8 = $01) Then
            color($00, $37, $00, $FF)
        Else
            color($37, $37, $37, $FF)
        EndIf
        For local2 = $00 To $0A Step $01
            rect((Int (45.0 * menuscale)), (Int ((Float TDD0Z6BXB6\Field9) - ((Float (local2 * $14)) * menuscale))), (Int (54.0 * menuscale)), (Int (10.0 * menuscale)), $01)
        Next
        If (T8660BZ460\Field8 = $02) Then
            color($64, $64, $FF, $FF)
            eax_0196 = (Int ((Float TDD0Z6BXB6\Field9) + (30.0 * menuscale)))
            drawimage(X2Z260BF0Z\Field4[$06], (Int (40.0 * menuscale)), $01, $00)
        ElseIf (T8660BZ460\Field8 = $01) Then
            color($64, $FF, $64, $FF)
            eax_01A8 = (Int ((Float TDD0Z6BXB6\Field9) + (30.0 * menuscale)))
            drawimage(X2Z260BF0Z\Field4[$06], (Int (40.0 * menuscale)), $00, $00)
        Else
            color($FF, $FF, $FF, $FF)
            eax_01B6 = (Int ((Float TDD0Z6BXB6\Field9) + (30.0 * menuscale)))
            drawimage(X2Z260BF0Z\Field4[$06], (Int (40.0 * menuscale)), $02, $00)
        EndIf
        local2 = (Int min(floor(((Float (T8660BZ460\Field2 + $32)) * 0.01)), 11.0))
        For local3 = $00 To local2 Step $01
            rect((Int (45.0 * menuscale)), (Int ((Float TDD0Z6BXB6\Field9) - ((Float (local3 * $14)) * menuscale))), (Int (54.0 * menuscale)), eax_01B6, eax_01A8, eax_0196)
        Next
        If (local2 < $03) Then
            If (70.0 <= batmsgtimer) Then
                color($FF, $00, $00, $FF)
                setfontex(XD00026ZX2\Field0[$02])
                textex(TDD0Z6BXB6\Field6, (Int (20.0 * menuscale)), getlocalstring("msg", "battery.low"), $01, $00)
            EndIf
        EndIf
    EndIf
    color($FF, $FF, $FF, $FF)
    Return $00
End Function
