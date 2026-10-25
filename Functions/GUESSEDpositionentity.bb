Function GUESSEDpositionentity%(arg0.TX2BF6X0FF4)
    If (arg0\Field4 = $00) Then
        Return $00
    EndIf
    positionentity(arg0\Field31, entityx(arg0\Field52, $00, 1.0), entityy(arg0\Field52, $00, 1.0), entityz(arg0\Field52, $00, 1.0), $00)
    rotateentity(arg0\Field31, 0.0, entityyaw(arg0\Field52, $00, 1.0), 0.0, $00)
    If (arg0\Field55\Field5 <> Null) Then
        translateentity(arg0\Field31, 0.0, arg0\Field55\Field5\Field56, 0.0, $00)
        turnentity(arg0\Field31, 0.0, arg0\Field55\Field5\Field47, 0.0, $00)
        GUESSEDscaleentity_4(arg0\Field31, arg0\Field55\Field5\Field61, (arg0\Field55\Field5\Field14 * (1.0 - ((Float arg0\Field37) * 0.2))), arg0\Field55\Field5\Field36, $00)
    EndIf
    GUESSEDsetentity_9(arg0)
    GUESSEDpositionentity_3(arg0)
    Return $00
End Function
