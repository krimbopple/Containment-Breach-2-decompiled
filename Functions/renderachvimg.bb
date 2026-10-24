Function renderachvimg%(arg0%, arg1%, arg2%, arg3$)
    Local local0%
    Local local1%
    Local local2#
    Local local3%
    Local local4%
    catcherrors("RenderAchvIMG")
    If (((arg3 = "055") And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
        Return $00
    EndIf
    local1 = (arg2 Mod $04)
    local2 = (101.0 * menuscale)
    local3 = (Int (85.0 * menuscale))
    local4 = (Int (((Float local1) * local2) + (Float arg0)))
    color($00, $00, $00, $FF)
    rect(local4, arg1, local3, local3, $01)
    If (TX6ZD06226X(unlockedachievements, arg3) <> 0) Then
        local0 = XF2FX4F0X2(achievementsimages, arg3)
    Else
        local0 = XF2FX4F0X2(achievementsimages, "locked")
    EndIf
    If (local0 <> $00) Then
        drawblock(local0, local4, arg1, $00)
    EndIf
    color($32, $32, $32, $FF)
    rect(local4, arg1, local3, local3, $00)
    catcherrors("Uncaught: RenderAchvIMG")
    Return $00
End Function
