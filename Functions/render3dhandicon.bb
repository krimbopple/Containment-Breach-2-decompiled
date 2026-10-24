Function render3dhandicon%(arg0%, arg1%, arg2%)
    Local local0%
    Local local1%
    Local local2%
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    local0 = (Int ((Float imagewidth(X2Z260BF0Z\Field3[arg0])) * 0.5))
    local1 = createpivot($00)
    local2 = createpivot($00)
    If (arg1 <> $00) Then
        If (entityexist(arg1) = $00) Then
            Return $00
        EndIf
        positionentity(local2, entityx(arg1, $01, rendertween), entityy(arg1, $01, rendertween), entityz(arg1, $01, rendertween), $00)
        positionentity(local1, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
        pointentity(local1, local2, 0.0)
    Else
        rotateentity(local1, entitypitch(camera, $00, 1.0), entityyaw(camera, $00, 1.0), entityroll(camera, $00, 1.0), $00)
    EndIf
    local3 = wrapangle((entityyaw(camera, $00, 1.0) - entityyaw(local1, $00, 1.0)), 360.0)
    If (((90.0 < local3) And (180.0 >= local3)) <> 0) Then
        local3 = 90.0
    EndIf
    If (((180.0 < local3) And (270.0 > local3)) <> 0) Then
        local3 = 270.0
    EndIf
    local4 = wrapangle((entitypitch(camera, $00, 1.0) - entitypitch(local1, $00, 1.0)), 360.0)
    If (((90.0 < local4) And (180.0 >= local4)) <> 0) Then
        local4 = 90.0
    EndIf
    If (((180.0 < local4) And (270.0 > local4)) <> 0) Then
        local4 = 270.0
    EndIf
    freeentity(local1)
    local1 = $00
    freeentity(local2)
    local2 = $00
    local5 = (((Float TDD0Z6BXB6\Field6) + ((Float (opt\Field21 / $03)) * sin(local3))) - (Float local0))
    local6 = (((Float TDD0Z6BXB6\Field9) - ((Float (opt\Field46 / $03)) * sin(local4))) - (Float local0))
    If (arg2 <> $FFFFFFFF) Then
        local7 = (Int (69.0 * menuscale))
        Select arg2
            Case $00
                local6 = (local6 - (Float local7))
            Case $01
                local5 = (local5 + (Float local7))
            Case $02
                local6 = (local6 + (Float local7))
            Case $03
                local5 = (local5 - (Float local7))
        End Select
    EndIf
    color($FF, $FF, $FF, (Int (XZ0260X8X2\Field59 * 255.0)))
    drawimage((Int local5), (Int local6), $00, $01)
    Return $00
End Function
