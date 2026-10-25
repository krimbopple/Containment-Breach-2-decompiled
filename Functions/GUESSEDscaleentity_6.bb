Function GUESSEDscaleentity_6%(arg0%, arg1%, arg2$, arg3$)
    Local local0%
    Local local1%
    Local local2.TXX0ZX4BDF2
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    If (((((CFX4Z8FFD[arg0] = Null) Lor (arg0 = $00)) Lor (arg1 >= $08)) Lor (arg2 = "")) <> 0) Then
        Return $00
    EndIf
    If (CFX4Z8FFD[arg0]\Field0[arg1] <> $00) Then
        freeentity(CFX4Z8FFD[arg0]\Field0[arg1])
        CFX4Z8FFD[arg0]\Field0[arg1] = $00
    EndIf
    local0 = $00
    local1 = $00
    arg2 = lower(arg2)
    arg3 = lower(arg3)
    For local2 = Each TXX0ZX4BDF2
        For local3 = $00 To $08 Step $01
            If (local2\Field11[local3] = arg2) Then
                local0 = local2\Field0[local3]
                Exit
            EndIf
        Next
    Next
    If (local0 = $00) Then
        local0 = loadmesh_strict(arg2, $00, (instr(arg2, "addons", $01) < $01))
        If (CFX4Z8FFD[arg0]\Field1 <> 0) Then
            local4 = loadanimmesh_strict(arg2, $00, (instr(arg2, "addons", $01) < $01))
            local5 = countchildren(local4)
            For local3 = $01 To local5 Step $01
                local6 = getchild(local4, local3)
                local7 = createpivot(local0)
                positionentity(local7, entityx(local6, $00, 1.0), entityy(local6, $00, 1.0), entityz(local6, $00, 1.0), $00)
                rotateentity(local7, entitypitch(local6, $00, 1.0), entityyaw(local6, $00, 1.0), entityroll(local6, $00, 1.0), $00)
                scaleentity(local7, entityscalex(local6, $00, 1.0), entityscaley(local6, $00, 1.0), entityscalez(local6, $00, 1.0), $00)
                nameentity(local7, entityname(local6))
            Next
            freeentity(local4)
        EndIf
        GUESSEDcreateentity_8(local0)
    EndIf
    CFX4Z8FFD[arg0]\Field11[arg1] = arg2
    CFX4Z8FFD[arg0]\Field0[arg1] = local0
    CFX4Z8FFD[arg0]\Field9[arg1] = arg3
    If (local0 <> $00) Then
        hideentity(local0)
    EndIf
    Return $01
    Return $00
End Function
