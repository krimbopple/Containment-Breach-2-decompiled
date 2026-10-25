Function MP_ChatCommand%(arg0$)
    Local local1%
    Local local2.TX2BF6X0FF4
    Select _SplitString(arg0, " ", $00)
        Case "/op"
            local1 = (Int _SplitString(arg0, " ", $01))
            If (((local1 <> GUESSEDupdatedropitem()) And (TXXF6F02DB2[local1] <> Null)) <> 0) Then
                GUESSEDcheckvalue_43(format(getlocalstring("broadcast", "op"), TXXF6F02DB2[local1]\Field27, "%s"))
                TXXF6F02DB2[local1]\Field46\Field39 = $01
            EndIf
        Case "/deop"
            local1 = (Int _SplitString(arg0, " ", $01))
            If (((local1 <> GUESSEDupdatedropitem()) And (TXXF6F02DB2[local1] <> Null)) <> 0) Then
                GUESSEDcheckvalue_43(format(getlocalstring("broadcast", "deop"), TXXF6F02DB2[local1]\Field27, "%s"))
                TXXF6F02DB2[local1]\Field46\Field39 = $00
            EndIf
        Case "/bot"
            Return $00
            local2 = MP_JoinServer("Bot")
            If (local2 <> Null) Then
                local2\Field19 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                local2\Field49 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                local2\Field26 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                local2\Field1 = entityyaw(XZ0260X8X2\Field74, $00, 1.0)
                local2\Field36 = entitypitch(camera, $00, 1.0)
                local2\Field37 = XZ0260X8X2\Field25
                local2\Field20 = TXXF6F02DB2[GUESSEDupdatedropitem()]\Field20
                local2\Field3 = TXXF6F02DB2[GUESSEDupdatedropitem()]\Field3
                local2\Field21\Field0 = (TXXF6F02DB2[GUESSEDupdatedropitem()]\Field21\Field0 + rand($00, $2710))
                local2\Field21\Field2 = TXXF6F02DB2[GUESSEDupdatedropitem()]\Field21\Field2
                local2\Field21\Field3 = _Steam_GetUInt64String(local2\Field21\Field2, local2\Field21\Field0)
            EndIf
        Default
            Return $00
    End Select
    Return $01
    Return $00
End Function
