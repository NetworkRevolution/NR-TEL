/*
 * Copyright 2020- Network Revolution Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.dokoden.nr_tel.ui

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dokoden.nr_tel.databinding.XferDialogFragmentBinding
import com.dokoden.nr_tel.model.MainViewModel
import com.google.android.material.tabs.TabLayoutMediator

class XferDialogFragment : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val mainViewModel by viewModels<MainViewModel>()
        val pagesSize = 4

        XferDialogFragmentBinding.inflate(inflater, container, false).also {
            it.lifecycleOwner = viewLifecycleOwner
            it.viewModel = mainViewModel
            it.viewpager.adapter = object : FragmentStateAdapter(childFragmentManager, lifecycle) {
                override fun getItemCount() = pagesSize
                override fun createFragment(position: Int) = when (position) {
                    0 -> Tab0Fragment()
                    1 -> Tab1Fragment()
                    2 -> Tab2Fragment()
                    3 -> Tab3Fragment()
                    else -> Tab0Fragment()
                }
            }
            TabLayoutMediator(it.tabLayout, it.viewpager, { tab, position ->

            }).attach()
            return it.root
        }
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        val hoge = "hoge"
    }
}
