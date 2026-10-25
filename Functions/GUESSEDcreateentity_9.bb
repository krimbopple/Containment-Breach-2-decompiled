Function GUESSEDcreateentity_9%(arg0.TX2BF6X0FF4)
    If (arg0\Field13 = GUESSEDupdatedropitem()) Then
        arg0\Field52 = XZ0260X8X2\Field74
        arg0\Field50 = camera
        arg0\Field54 = camera
    ElseIf (arg0\Field52 = $00) Then
        arg0\Field52 = createpivot($00)
        entityradius(arg0\Field52, 0.15, 0.5)
        entitytype(arg0\Field52, $02, $00)
        hideentity(arg0\Field52)
        arg0\Field50 = createcamera(arg0\Field52)
        positionentity(arg0\Field50, 0.0, 0.6, 0.0, $00)
        cameraviewport(arg0\Field50, $00, $00, $780, $438)
        camerarange(arg0\Field50, 0.01, 50.0)
        hideentity(arg0\Field50)
        arg0\Field54 = createpivot(arg0\Field52)
        hideentity(arg0\Field54)
    EndIf
    Return $00
End Function
