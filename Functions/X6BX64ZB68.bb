Function X6BX64ZB68%(arg0.XF808F44XB, arg1%)
    If (arg0\Field3 <> 0) Then
        Return $00
    EndIf
    If (arg1 <> grabbedentity) Then
        arg0\Field9 = (arg0\Field9 - fps\Field3[$01])
        If (0.0 >= arg0\Field9) Then
            positionentity(arg1, curvevalue(arg0\Field6, entityx(arg1, $01, 1.0), 4.0), curvevalue(arg0\Field11, entityy(arg1, $01, 1.0), 4.0), curvevalue(arg0\Field4, entityz(arg1, $01, 1.0), 4.0), $01)
            rotateentity(arg1, clamp(curvevalue(arg0\Field10, entitypitch(arg1, $01, 1.0), 4.0), -89.9, 89.9), curveangle(arg0\Field15, entityyaw(arg1, $01, 1.0), 4.0), curveangle(arg0\Field13, entityroll(arg1, $01, 1.0), 4.0), $01)
        EndIf
    Else
        TXDFXDZXXDD\Field10 = arg0
        arg0\Field9 = 35.0
    EndIf
    Return $00
End Function
