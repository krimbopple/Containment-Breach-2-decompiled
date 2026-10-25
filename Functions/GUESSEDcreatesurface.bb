Function GUESSEDcreatesurface%(arg0%, arg1%, arg2%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (entityclass(arg0) = "Mesh") Then
        local0 = countsurfaces(arg0)
        For local1 = $01 To local0 Step $01
            local2 = getsurface(arg0, local1)
            local3 = getsurfacebrush(local2)
            If (local3 <> $00) Then
                GUESSEDgetbrush_3(local3, arg2, $00)
                paintsurface(local2, local3)
                freebrush(local3)
                local3 = $00
            EndIf
        Next
    Else
        GUESSEDfreeentity_7(arg0, arg2, $00)
    EndIf
    GUESSEDloadmask(arg0, arg1)
    Return $00
End Function
