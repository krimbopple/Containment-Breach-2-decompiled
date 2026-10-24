Function TX4F2D44D4X%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1#
    Local local2#
    If (arg0\Field13 = TXXDZB2ZBXX()) Then
        Return $00
    EndIf
    local0 = 0.0
    If (arg0\Field48 > $00) Then
        local0 = (((Float (arg0\Field48 = $02)) * 30.0) + -15.0)
    EndIf
    local1 = 0.0
    local2 = 1.0
    If (arg0\Field55\Field5 <> Null) Then
        local1 = arg0\Field55\Field5\Field38
        If (0.0 < arg0\Field55\Field6) Then
            local2 = arg0\Field55\Field6
        EndIf
    EndIf
    positionentity(arg0\Field54, (arg0\Field19 - ((cos(arg0\Field1) * local0) * 0.0055)), (arg0\Field49 + (((((Float arg0\Field37) * -0.3) + 0.6) + local1) * local2)), (arg0\Field26 - ((sin(arg0\Field1) * local0) * 0.0055)), $01)
    rotateentity(arg0\Field54, arg0\Field36, arg0\Field1, local0, $01)
    X8X0BB2XZ6(arg0\Field35[$00])
    X44DDFXFX0(arg0\Field35[$00], entityx(arg0\Field54, $01, 1.0), entityy(arg0\Field54, $01, 1.0), entityz(arg0\Field54, $01, 1.0))
    X8X0BB2XZ6(arg0\Field35[$01])
    X44DDFXFX0(arg0\Field35[$01], entitypitch(arg0\Field54, $01, 1.0), entityyaw(arg0\Field54, $01, 1.0), entityroll(arg0\Field54, $01, 1.0))
    Return $00
End Function
