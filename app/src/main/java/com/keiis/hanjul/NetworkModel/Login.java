package com.keiis.hanjul.NetworkModel;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hojun on 2017-03-19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @SerializedName("code_valu")
    private String code_value;
    private String code_name;
}
