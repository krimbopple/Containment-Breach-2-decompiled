Function TFXZZ8Z6F2%()
    Local local0.XZ0FBD6000
    Local local1#
    Local local2#
    Local local3#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9%
    Local local11%
    Local local12$
    If (opt\Field74 = $00) Then
        Return $00
    EndIf
    For local0 = Each XZ0FBD6000
        local0\Field18 = $00
        If (local0\Field8 > $00) Then
            local1 = 0.0
            local2 = 0.0
            local3 = 0.0
            Select local0\Field8
                Case $01
                    If (TXXF6F02DB2[local0\Field16] <> Null) Then
                        local1 = entityx(TXXF6F02DB2[local0\Field16]\Field50, $01, 1.0)
                        local2 = entityy(TXXF6F02DB2[local0\Field16]\Field50, $01, 1.0)
                        local3 = entityz(TXXF6F02DB2[local0\Field16]\Field50, $01, 1.0)
                    EndIf
                Case $02
                    local1 = local0\Field27
                    local2 = local0\Field15
                    local3 = local0\Field10
            End Select
            If (cameraproject(camera, local1, local2, local3, $00) = $00) Then
                Goto section__5862
            EndIf
            local0\Field9 = (projectedx() / graphicwidthfloat)
            local0\Field14 = ((projectedy() / graphicheightfloat) - 0.01)
        EndIf
        local5 = local0\Field9
        local6 = local0\Field14
        local7 = (local0\Field2 * graphicwidthfloat)
        local8 = (local0\Field19 * graphicheightfloat)
        If (0.0 < local0\Field17) Then
            If (1.0 > local0\Field17) Then
                local0\Field4 = local0\Field0
            Else
                local0\Field4 = TXX2F60Z0XB(local0\Field0, local0\Field4, local0\Field17, TX8FF82X024())
            EndIf
        Else
            local0\Field4 = 1.0
        EndIf
        local9 = ((local0\Field6 And (TX84DF6X6B6\Field5 = $00)) And mouseon((Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), (Int local7), (Int local8)))
        Select local0\Field21
            Case $01
                setfontex(XD00026ZX2\Field0[(Int min((Float local0\Field3), 23.0))])
                color(local0\Field28, local0\Field25, local0\Field12, (Int (local0\Field4 * 255.0)))
                local11 = XF4086X4F8(local0\Field11, (Int (local5 * graphicwidthfloat)), (Int (local6 * graphicheightfloat)), opt\Field21, opt\Field46, local0\Field13, -1.2, local0\Field4, ((Float local0\Field24) * ((Float fontheight()) * 0.05)))
                local0\Field18 = $00
                If ((local0\Field6 And local11) <> 0) Then
                    color($64, $64, $64, (Int ((local0\Field4 * 255.0) * 0.3)))
                    rowtext(XBBFXB0Z4B(local0\Field11), (Int (local5 * graphicwidthfloat)), (Int (local6 * graphicheightfloat)), opt\Field21, opt\Field46, local0\Field13, -1.2)
                    local0\Field18 = $01
                EndIf
            Case $02
                color(local0\Field28, local0\Field25, local0\Field12, (Int (local0\Field4 * 255.0)))
                If (local0\Field3 <> $00) Then
                    local12 = trim(fileextension(local0\Field11))
                    If (local12 <> "webm") Then
                        resizeimage(local0\Field3, (Int local7), (Int local8))
                        rotateimage(local0\Field3, (Float local0\Field20))
                        If (local9 <> 0) Then
                            color((Int ((Float local0\Field28) * 0.707)), (Int ((Float local0\Field25) * 0.707)), (Int ((Float local0\Field12) * 0.707)), (Int (local0\Field4 * 255.0)))
                            local0\Field18 = $01
                        EndIf
                        esi_002E = (Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13))))
                        drawimage(local0\Field3, (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), $00, $01)
                    Else
                        drawmovie(local0\Field3, (Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), (Int local7), (Int local8))
                        If (local9 <> 0) Then
                            color($64, $64, $64, $46)
                            rect((Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), esi_002E, (Int local8), $01)
                            local0\Field18 = $01
                        EndIf
                    EndIf
                Else
                    resizeimage(T64BBD88XX, (Int local7), (Int local8))
                    esi_0049 = (Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13))))
                    drawimage(T64BBD88XX, (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), $00, $01)
                EndIf
            Case $03
                color(local0\Field28, local0\Field25, local0\Field12, (Int (local0\Field4 * 255.0)))
                If (local9 <> 0) Then
                    color((Int ((Float local0\Field28) * 0.707)), (Int ((Float local0\Field25) * 0.707)), (Int ((Float local0\Field12) * 0.707)), (Int (local0\Field4 * 255.0)))
                    local0\Field18 = $01
                EndIf
                rect((Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), esi_0049, (Int local8), $01)
            Case $04
                color(local0\Field28, local0\Field25, local0\Field12, (Int (local0\Field4 * 255.0)))
                If (local9 <> 0) Then
                    color((Int ((Float local0\Field28) * 0.707)), (Int ((Float local0\Field25) * 0.707)), (Int ((Float local0\Field12) * 0.707)), (Int (local0\Field4 * 255.0)))
                    local0\Field18 = $01
                EndIf
                T2XX60BD226((Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), (Int local7), (Int local8), $01)
            Case $05
                color($FF, $FF, $FF, $FF)
                renderbar(X2Z260BF0Z\Field4[$02], (Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), (Int local7), (Int local8), local0\Field7, local0\Field1, local0\Field28, local0\Field25, local0\Field12, $01)
                local0\Field7 = min((local0\Field7 + (TX8FF82X024() / 70.0)), local0\Field1)
                If (local9 <> 0) Then
                    color($64, $64, $64, $46)
                    rect((Int ((local5 * graphicwidthfloat) - ((local7 / 2.0) * (Float local0\Field13)))), (Int ((local6 * graphicheightfloat) - ((local8 / 2.0) * (Float local0\Field13)))), (Int local7), (Int local8), $01)
                    local0\Field18 = $01
                EndIf
        End Select
.section__5862
    Next
    Return $00
End Function
